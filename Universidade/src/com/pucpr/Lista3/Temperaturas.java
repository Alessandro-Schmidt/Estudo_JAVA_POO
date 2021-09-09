package src.com.pucpr.Lista3;

import java.sql.SQLOutput;

public class Temperaturas {
    // Conversor de Celcius - Fahrenheit - Kelvin;
    private double temperatura;
    private MedidasTemperaturas medida;

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void setMedida(MedidasTemperaturas medida) {
        this.medida = medida;
    }

    public Temperaturas(double temperatura, MedidasTemperaturas medida) {
        this.temperatura = temperatura;
        this.medida = medida;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public MedidasTemperaturas getMedida() {
        return medida;
    }

    public void printStatus(){
        System.out.printf("Tempertura: " +this.temperatura +" " + this.medida);
    }

    public void converter(MedidasTemperaturas novaMedida){
        assert (medida!=novaMedida);

    }

}