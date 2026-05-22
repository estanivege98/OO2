package org.example;

public class ExcursionLleno implements IStateExcursion{
    public ExcursionLleno(){ }

    public void inscribir(Usuario unUsuario, Excursion excursion){
        // podrías agregar una lista de espera, por ahora evitamos inscribir
        System.out.println("No se pueden inscribir mas usuarios, la excursion esta llena");
    }

    public String obtenerInformacion(Excursion excursion){
        // según README, cuando está lleno la información solo incluye nombre, costo, fechas y punto de encuentro.
        // Aquí mostramos una versión mínima:
        String cadena = "\nNombre: " + excursion.getNombre()
                + "\nPrecio: " + excursion.getPrecio()
                + "\nFecha inicio: " + excursion.getFechaInicio()
                + "\nFecha fin: " + excursion.getFechaFin()
                + "\nPunto de encuentro: " + excursion.getPuntodeEncuentro()
                + "\nLa excursion esta llena, no se pueden inscribir mas usuarios";
        return cadena;
    }
}
