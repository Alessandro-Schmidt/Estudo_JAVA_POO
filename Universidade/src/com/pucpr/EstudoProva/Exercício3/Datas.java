package src.com.pucpr.EstudoProva.Exercício3;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Datas {
    private int dia,mes,ano;

    public Datas(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        this.ano = ano;
    }

    public Datas(){
        LocalDate localDate = LocalDate.now();
        setDia(localDate.getDayOfMonth());
        setMes(localDate.getMonthValue());
        setAno(localDate.getYear());
    }

    public void printStatus(){
        System.out.println(getDia()+"/"+getMes()+"/"+getAno());
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia > 0 && dia <= 31)
            this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes > 0 && mes <=12)
            this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
