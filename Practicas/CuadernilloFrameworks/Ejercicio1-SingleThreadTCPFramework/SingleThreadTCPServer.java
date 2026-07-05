import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public abstract class SingleThreadTCPServer {

    public abstract void handleMessage(String message, PrintWriter out);

    public final void startLoop(String[] args) {
        checkArguments(args);

        int portNumber = Integer.parseInt(args[0]);

    
        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
            displaySocketInformation(portNumber);
            while (true) {
                Socket clientSocket = acceptAndDisplaySocket(serverSocket);
                handleClient(clientSocket);
            }
        } catch (IOException e) {
            displayAndExit(portNumber);
        }
    }

    protected void displayAndExit(int portNumber) {
        System.err.println("Could not listen on port " + portNumber);
        System.exit(-1);
    }

    protected Socket acceptAndDisplaySocket(ServerSocket serverSocket) throws IOException {
        Socket clientSocket = serverSocket.accept();
        displaySocketData(clientSocket);
        return clientSocket;
    }

    protected void displaySocketData(Socket clientSocket) {
        System.out.println("Client connected from: " + clientSocket.getInetAddress().getHostAddress() + ":"
                + clientSocket.getPort());
    }

    protected void displaySocketInformation(int portNumber) {
        System.out.println(this.getClass().getName() + " server listening on port: " + portNumber);
    }

    protected void checkArguments(String[] args) {
        if (args.length != 1) {
            displayUsage();
            System.exit(1);
        }
    }

    protected void displayUsage() {
        System.err.println("Usage: java"+this.getClass().getName() +"<port number>");
    }

    

    protected final void handleClient(Socket clientSocket) {
        try (
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));) {
            
            // Template Method pattern: define the skeleton of the algorithm
            beforeClientHandling(clientSocket, out, in);
            
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                onMessageReceived(inputLine, clientSocket);
                
                if (shouldTerminateConnection(inputLine)) {
                    break;
                }
                
                handleMessage(inputLine, out);
            }
            
            afterClientHandling(clientSocket, out, in);
            
        } catch (IOException e) {
            onIOException(clientSocket, e);
        } finally {
            try {
                clientSocket.close();
            } catch (IOException e) {
                onSocketCloseException(clientSocket, e);
            }
        }
    }

    // Hook methods - optional, can be overridden by subclasses
    
    protected void beforeClientHandling(Socket socket, PrintWriter out, BufferedReader in) {
        System.out.println("Received message: " + socket.getInetAddress().getHostAddress() + ":"
                + socket.getPort());
    }

    protected void onMessageReceived(String message, Socket socket) {
        System.out.println("Received message: " + message + " from "
                + socket.getInetAddress().getHostAddress() + ":" + socket.getPort());
    }

    protected boolean shouldTerminateConnection(String inputLine) {
        return inputLine.equalsIgnoreCase("");
    }

    protected void afterClientHandling(Socket socket, PrintWriter out, BufferedReader in) {
        System.out.println("Connection closed with " + socket.getInetAddress().getHostAddress() + ":"
                + socket.getPort());
    }

    protected void onIOException(Socket socket, IOException e) {
        System.err.println("Problem with communication with client: " + e.getMessage());
    }

    protected void onSocketCloseException(Socket socket, IOException e) {
        System.err.println("Error closing socket: " + e.getMessage());
    }
}
