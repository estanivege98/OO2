package org.example;

import java.time.LocalDate;

public interface IPoliticaCancelacion {
    double montoAReembolsar(LocalDate fechaCancelacion, double monto, LocalDate fechaReserva);
}
