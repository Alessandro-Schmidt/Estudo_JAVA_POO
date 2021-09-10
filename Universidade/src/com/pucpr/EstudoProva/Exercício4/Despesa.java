package src.com.pucpr.EstudoProva.Exercício4;

import java.time.LocalDate;

public class Despesa {
    private String description;
    private float value;
    private LocalDate localDate;

    public Despesa(String description, float value, int dia, int mes, int ano) {
        this.description = description;
        this.value = value;
        setLocalDate(dia,mes,ano);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getDate() {
        return localDate.getDayOfMonth()+"/"+localDate.getMonthValue()+"/"+localDate.getYear();
    }

    public void setLocalDate(int dia,int mes,int ano) {
        this.localDate = LocalDate.parse(ano+"-"+mes+"-"+dia);
    }

    public void printStatus(){
        System.out.println(getDate() + " - ");
    }
}
