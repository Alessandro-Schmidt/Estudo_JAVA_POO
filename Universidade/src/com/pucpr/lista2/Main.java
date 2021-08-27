package src.com.pucpr.lista2;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Main {
    public static void lista1(String[] args) {
        // Exercício 1.
        //Pessoa Alessandro = new Pessoa();
        //Alessandro.status();
        //Alessandro.setaltura();
        //Alessandro.status();
        //Alessandro.setNome("Roberto");
        //Alessandro.setAltura(1.67f);
        //Alessandro.setNascimento(2004);
        //Alessandro.status();

        //Pessoa exemplo2 = new Pessoa("Alessandro", 1997,1.75);
        //exemplo2.status();

        //Scanner scanner = new Scanner(System.in);
        //Pessoa pessoa3 = new Pessoa();
        //System.out.println("Digite seu nome: ");
        //pessoa3.setNome(scanner.next());
        //System.out.println("Digite seu ano de nascimento: ");
        //pessoa3.setNascimento(scanner.nextInt());
        //System.out.println("Digite sua altura: ");
        //pessoa3.setAltura(scanner.nextDouble());
       //pessoa3.status();

        // Exercício 2
        //veículo BWM = new veículo("prata","Honda","Fit",
            //    2015,5,40,12,8.5);
        //BWM.Status();

    }
    private static void lista2ex2(){
        veículo BWM = new veículo("prata","Honda","Fit",
                    2015,5,40,12,8.5);
                BWM.Status();
    }

    private static void lista2Exercicio3() {
        Retangulo ret = new Retangulo(5, 3, 10, 10);
        ret.status();
    }
    public static void main(String[] args) {
        // write your code here
        //lista2Exercicio1();
        //lista2Exercicio2();
        lista2Exercicio3();
    }

}

