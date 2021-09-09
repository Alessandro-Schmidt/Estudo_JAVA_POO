package src.com.pucpr.Lista3;

public class ConversorTemperatura {
    private double temperatura;
    private MedidaTemperatura medida;

    public ConversorTemperatura(double temperatura,
                                MedidaTemperatura medida) {
        this.temperatura = temperatura;
        this.medida = medida;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public MedidaTemperatura getMedida() {
        return medida;
    }

    public void setMedida(MedidaTemperatura medida) {
        this.medida = medida;
    }

    public void printStatus(){
        System.out.println("Temperatura:"+
                temperatura+" "+medida);
    }
    private double getKelvinFromCelsius(double value){
        assert (value > -273.15);
        double temp = value + 273.15;
        assert (temp > 0.0);
        return temp;
    }
    private double getCelsiusFromKelvin(double value){
        assert (value > 0.0);
        double temp = value - 273.15;
        assert (temp > -273.15);
        return temp;
    }
    private double getFahrenheitFromCelsius(double value){
        assert (value > -273.15);
        double temp = value * 1.8 + 32.0;
        return temp;
    }
    private double getCelsiusFromFahrenheit(double value){
        double temp = (value - 32.0)*(5.0/9.0);
        assert (temp > - 273.15);
        return temp;
    }
    public void converter(MedidaTemperatura novaMedida){
        assert (medida != novaMedida);
        if(medida == MedidaTemperatura.Celsius){
            if(novaMedida == MedidaTemperatura.Kelvin){
                temperatura = getKelvinFromCelsius(temperatura);
            }else if(novaMedida == MedidaTemperatura.Fahrenheit){
                temperatura = getFahrenheitFromCelsius(temperatura);
            }
        }else if(medida == MedidaTemperatura.Kelvin){
            if(novaMedida == MedidaTemperatura.Celsius){
                temperatura = getCelsiusFromKelvin(temperatura);
            }else if(novaMedida == MedidaTemperatura.Fahrenheit){
                temperatura = getFahrenheitFromCelsius(
                        getCelsiusFromKelvin(temperatura)
                );
            }
        }else if(medida == MedidaTemperatura.Fahrenheit){
            if(novaMedida == MedidaTemperatura.Celsius){
                temperatura = getCelsiusFromFahrenheit(temperatura);
            }else if(novaMedida == MedidaTemperatura.Kelvin){
                temperatura = getKelvinFromCelsius(
                        getCelsiusFromFahrenheit(temperatura)
                );
            }
        }
        medida = novaMedida;

    }
    /*public void converter(String novaMedida){
        novaMedida = "celsiu";
        if(medida.equalsIgnoreCase(novaMedida))
            return;
    }*/
}
