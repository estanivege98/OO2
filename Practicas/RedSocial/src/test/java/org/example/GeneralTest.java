package org.example;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class GeneralTest {
    Twitter twitter;
    Usuario user;
    Usuario user2;
    Tweet tweet1;
    Tweet tweet2;
    ReTweet reTweet1;
    Tweet tweet3;
    @BeforeEach
    void setUp() throws Exception {
        twitter = new Twitter();
        user = new Usuario(twitter);
        user2 = new Usuario(twitter);
        tweet1 = new Tweet();
        tweet2 = new Tweet();
        tweet2.crearTweet("A veces uno cree que necesita tener todo resuelto para avanzar, pero en realidad es al revés: avanzar, aunque sea un poco, es lo que ordena las cosas. No esperes el momento perfecto, porque no existe. Empezá con lo que tenés hoy y ajustá en el camino.");
        tweet3 = new Tweet();
        tweet3.crearTweet("hola");
        reTweet1 = new ReTweet(tweet3);
    }

//    @Test
//    public void Test(){
//        user.agregarTweet(tweet1);
//        user.agregarTweet(tweet2);
//        user.agregarTweet(tweet3);
//        user.agregarTweet(reTweet1);
//        user.crearMiCuenta("pepe");
//        user.crearMiCuenta("pepe");
//        assertEquals("pepe", user.getNombre());
//        
//    }

    @Test
    public void testTweetVacio() {
        tweet1.crearTweet(""); // 0 carácteres
        assertEquals("", tweet1.getTexto());
    }

    @Test
    public void testTweetMasDe280Caracteres() {
        String largo = "a".repeat(281);
        tweet3.crearTweet(largo);
        
        // comprobamos que el texto original no se haya modificado ya que falló la validación
        assertEquals("hola", tweet3.getTexto(), "El texto no debería cambiar porque la nueva entrada superó los 280 caracteres");
    }

    @Test
    public void testNombreUsuarioNoSeRepite() {
        user.crearMiCuenta("juan");
        
        user2.crearMiCuenta("juan"); // Intenta crear con el mismo nombre
        
        // 'user' debería tener el nombre guardado correctamente
        assertEquals("juan", user.getNombre());
        
        // 'user2' no debería poder llamarse "juan", por lo tanto su nombre queda sin asignar (null)
        assertNull(user2.getNombre());
    }
}