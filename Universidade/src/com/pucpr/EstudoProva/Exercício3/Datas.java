package src.com.pucpr.EstudoProva.Exercício3;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Datas {
    LocalDate localDate;

    public Datas(int dia, int mes, int ano) {
        localDate = LocalDate.parse(ano+"-"+mes+"-"+dia);
    }

    public Datas(){
        localDate = LocalDate.now();
    }

    public void printStatus(){
        System.out.println(getDia()+"/"+getMes()+"/"+getAno());
    }

    public int getDia() {
        return localDate.getDayOfMonth();
    }

    public void setDia(int dia) {
        localDate = LocalDate.parse(getAno()+"-"+getMes()+"-"+dia);
    }

    public int getMes() {
        return localDate.getMonthValue();
    }

    public void setMes(int mes) {
        localDate = LocalDate.parse(getAno()+"-"+mes+"-"+getDia());
    }

    public int getAno() {
        return localDate.getYear();
    }

    public void setAno(int ano) {
        localDate = LocalDate.parse(ano+"-"+getMes()+"-"+getDia());
    }

    public void adicionarUmDia(){
        localDate = localDate.plusDays(1);
    }
}
