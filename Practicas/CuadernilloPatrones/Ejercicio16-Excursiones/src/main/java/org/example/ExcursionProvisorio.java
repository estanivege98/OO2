package org.example;

public class ExcursionProvisorio implements IStateExcursion{
    public ExcursionProvisorio(){ }

    public void inscribir(Usuario unUsuario, Excursion excursion){
        // agrego al listado (provisorio)
        excursion.agregarInscripto(unUsuario);

        // si al agregar alcanzamos el cupo mínimo, cambio el estado
        if (excursion.seAlcanzoCupoMinimo()){
            excursion.setEstadoExcursion(new ExcursionDefinitivo());
        }
    }

    public String obtenerInformacion(Excursion excursion){
        String mailsInscriptos = excursion.obtenerMailInsciptos().toString();
        String cadena = "\nMails Inscriptos: " + mailsInscriptos
                + "\nCantidad de usuarios faltantes para el cupo minimo: "
                + excursion.faltantesParaMinimo();
        return cadena;
    }
}

