package org.example;

import java.time.LocalDate;
import java.util.List;

public class Afiliado {
    private String nombre;
    private int familiaresACargo;
    private double salario;
    private LocalDate fechaNacimiento;
    private List<PlanMedico> previos;
    private PlanMedico plan;
    private ICoseguro coseguro;

    public Afiliado(String nombre, int familiaresACargo, double salario, LocalDate fechaNacimiento, List<PlanMedico> previos, PlanMedico plan, ICoseguro coseguro) {
        this.nombre = nombre;
        this.familiaresACargo = familiaresACargo;
        this.salario = salario;
        this.fechaNacimiento = fechaNacimiento;
        this.previos = previos;
        this.plan = plan;
        this.coseguro = coseguro;
    }

    public void setPlanMedico(PlanMedico plan) {
        this.previos.add(this.plan);
        this.plan = plan;
    }

    public void setCoseguro(ICoseguro coseguro) {
        this.coseguro = coseguro;
    }

    public int getFamiliaresACargo() {
        return this.familiaresACargo;
    }

    public double getSalario() {
        return this.salario;
    }

    public double calcularMonto(){
        return this.plan.limitePrestaciones(this.coseguro, this);
    }
}
