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
    public double coberturaViajera(Afiliado afiliado, ICoseguro coseguro){
        return (afiliado.getSalario() * 0.01) - (coseguro.getAntiguedad() != 0 ? (coseguro.getMontoCoberturaViaje()) : 0.0);
    }
    public double seguroPorInternacion(){
        return this.monto * 0.05;
    }
}
