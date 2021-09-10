package src.com.pucpr.EstudoProva.Exercício2;

public class Main {
    public static void main(String[] args) {
        Empregado mat_1 = new Empregado("João", "Schmidt", 1564.99f);
        Empregado mat_2 = new Empregado("Maria", "Strauzburg", 145.99f);
        mat_1.Status();
        mat_2.Status();

        mat_1.getAumento();
        mat_1.Status();

        mat_2.getAumento();
        mat_2.Status();
    }
}
