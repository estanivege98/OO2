package org.example;

import java.time.LocalDate;

public class PlanIntegral extends PlanMedico{

    private static final double monto = 22000;
    private static final double anioPorAntiguedad = 10000;

    public PlanIntegral(LocalDate fechaContratacion) {
        super(fechaContratacion);
    }

    public double obtenerMontoFijo(ICoseguro coseguro){
        return this.monto;
    }
    public double cargoPorGrupoFamiliar(Afiliado afiliado, ICoseguro coseguro){
        return (afiliado.getFamiliaresACargo() * 3_000) + (afiliado.getSalario() * 0.01);
    }
    @Override
    public double coberturaViajera(Afiliado afiliado, ICoseguro coseguro){
        return (afiliado.getSalario() * 0.03) - (coseguro.getAntiguedad()  * anioPorAntiguedad);
    }
    public double seguroPorInternacion(){
        return this.monto * 0.05;
    }
}
