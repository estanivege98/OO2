package org.example;

import java.time.LocalDate;

public abstract class PlanMedico {
    private LocalDate fechaContratacion;

    public PlanMedico(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public LocalDate getFechaContratacion() {
        return this.fechaContratacion;
    }

    public double limitePrestaciones(ICoseguro coseguro, Afiliado afiliado) {
        return this.obtenerMontoFijo(coseguro) + this.cargoPorGrupoFamiliar(afiliado, coseguro) + this.coberturaViajera(afiliado, coseguro) + this.seguroPorInternacion();
    }

    public abstract double obtenerMontoFijo(ICoseguro coseguro);
    public abstract double cargoPorGrupoFamiliar(Afiliado afiliado, ICoseguro coseguro);
    public abstract double coberturaViajera(Afiliado afiliado, ICoseguro coseguro);
    public abstract double seguroPorInternacion();
}
