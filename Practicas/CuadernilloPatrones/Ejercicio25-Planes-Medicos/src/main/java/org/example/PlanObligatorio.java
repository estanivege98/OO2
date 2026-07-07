package org.example;

import java.time.LocalDate;

public class PlanObligatorio extends PlanMedico {
    private static final double monto = 15000;

    public PlanObligatorio(LocalDate fechaContratacion) {
        super(fechaContratacion);
    }

    public double obtenerMontoFijo(ICoseguro coseguro){
        return this.monto;
    }
    public double cargoPorGrupoFamiliar(Afiliado afiliado, ICoseguro coseguro){
        return (afiliado.getFamiliaresACargo() * 3.500)- coseguro.getDescuento();
    }
    public double coberturaViajera(Afiliado afiliado, ICoseguro coseguro){
        return (afiliado.getSalario() * 0.01) - (coseguro.getAntiguedad() != 0 ? (coseguro.getMontoCoberturaViaje()) : 0.0);
    }
    public double seguroPorInternacion(){
        return 0.0;
    }
}
