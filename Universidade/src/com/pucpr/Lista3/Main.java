package src.com.pucpr.Lista3;

public class Main {
    public static void main(String[] args) {
        Temperaturas conversor = new Temperaturas(24, MedidasTemperaturas.Celcius);
        conversor.printStatus();
        conversor.converter(MedidasTemperaturas.Celcius);
    }
}
