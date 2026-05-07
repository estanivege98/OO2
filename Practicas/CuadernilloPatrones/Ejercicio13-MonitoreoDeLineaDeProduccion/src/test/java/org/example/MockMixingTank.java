package org.example;

public class MockMixingTank implements MixingTank{
    final int LIMITE_INFERIOR = 0;
    final int LIMITE_SUPERIOR = 100;

    private int potCalor;
    private int potMezclador;
    private double volOcupado;
    private double temp;

    public MockMixingTank(double volOcupado, double temp){
        exeptionInvalidNumber(volOcupado);

        this.volOcupado = volOcupado;
        this.temp = temp;
    }

    @Override
    public boolean heatPower(int percentage){
        if(isValidNumber(percentage)){
            this.potCalor = percentage;
            return true;
        }
        return false;
    }

    @Override
    public boolean mixerPower(int percentage){
        if(isValidNumber(percentage)){
            this.potMezclador = percentage;
            return true;
        }
        return false;
    }

    @Override
    public boolean purge() {
        if (this.volOcupado > 0){
            this.volOcupado = 0;
            int inc = calcTempIncrease();
            this.temp += (4 * inc);
            return true;
        }
        return false;
    }

     @Override
     public double upTo() {
         return this.volOcupado;
     }

    @Override
    public double temperature() {
        return this.temp;
    }

    public int getHeatPower() {
        return this.potCalor;
    }

    public int getMixerPower() {
        return this.potMezclador;
    }

     public int calcTempIncrease() {
         if (this.potCalor <= 0) return 0;
         if (this.potCalor <= 25) return 1;
         if (this.potCalor <= 50) return 2;
         if (this.potCalor <= 75) return 4;
         if (this.potCalor <= 100) return 5;
         return 0;
     }
    private boolean isValidNumber(double num){
        return (num >= LIMITE_INFERIOR && num <= LIMITE_SUPERIOR);
    }

    private void exeptionInvalidNumber(double volOcupado) {
        if(!isValidNumber(volOcupado)){
            throw new IllegalArgumentException("El numero debe estar entre " + LIMITE_INFERIOR + " y " + LIMITE_SUPERIOR);
        }
    }
}
