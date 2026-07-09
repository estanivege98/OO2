package org.example;

import java.time.LocalDate;

public class PlanPremium extends PlanMedico{
    private static final double monto = 33000;

    public PlanPremium(LocalDate fechaContratacion) {
        super(fechaContratacion);
    }

    public double obtenerMontoFijo(ICoseguro coseguro){
        return this.monto + (coseguro.getDescuento());
    }
    public double cargoPorGrupoFamiliar(Afiliado afiliado, ICoseguro coseguro){
        return afiliado.getFamiliaresACargo() <= 4 ? 0.0 : (afiliado.getFamiliaresACargo() * 2.800);
    }

    public double seguroPorInternacion(){
        return this.monto * 0.05;
    }
}
