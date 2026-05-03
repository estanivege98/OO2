package org.example;

import java.time.LocalDate;

public class PoliticaCancelacionFlexible implements IPoliticaCancelacion{
    public PoliticaCancelacionFlexible(){

    }

    public double montoAReembolsar(LocalDate fechaCancelacion, double monto, LocalDate fechaReserva){
        return monto;
    }
}
