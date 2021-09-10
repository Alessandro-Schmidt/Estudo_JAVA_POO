package src.com.pucpr.EstudoProva.Exercicio1;

public class Main {
    public static void exercicio1(){
        Invoice p1 = new Invoice(99, "Um produto muito interessante.", 115, 15.99f);
        p1.status();
        Invoice p2 = new Invoice(37, "Um café com leite ", 32, 45.6f);
        p2.status();
    }
    public static void main(String[] args) {
        exercicio1();
    }
}
