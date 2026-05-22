package org.example;

public class ExcursionDefinitivo implements IStateExcursion{
    public ExcursionDefinitivo(){ }

    public void inscribir(Usuario unUsuario, Excursion excursion){
        excursion.agregarInscripto(unUsuario);

        if (excursion.seAlcanzoCupoMaximo()){
            excursion.setEstadoExcursion(new ExcursionLleno());
        }
    }

    public String obtenerInformacion(Excursion excursion){
        String mailsInscriptos = excursion.obtenerMailInsciptos().toString();
        String cadena = "\nMails Inscriptos: " + mailsInscriptos
                + "\nCantidad de usuarios faltantes para el cupo maximo: "
                + excursion.faltantesParaMaximo();
        return cadena;
    }
}
