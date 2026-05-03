package org.example;

import java.time.LocalDate;

public class PoliticaCancelacionModerada implements IPoliticaCancelacion{
    public PoliticaCancelacionModerada(){

    }

    public double montoAReembolsar(LocalDate fechaCancelacion, double monto, LocalDate fechaReserva){
        if(fechaCancelacion.isBefore(fechaReserva.minusDays(7))){
            return monto;
        } else {
            return monto * 0.5;
        }
    }
}
