package src.com.pucpr.Lista3;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ConversorTemperatura conversor =
                new ConversorTemperatura(
                24,MedidaTemperatura.Fahrenheit
        );
        conversor.printStatus();
        //conversor.converter(MedidaTemperatura.Celsius);
        conversor.converter(MedidaTemperatura.Kelvin);
        conversor.printStatus();


    }
}
