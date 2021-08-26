package src.com.pucpr.lista2;

import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class pessoa {
    Scanner input = new Scanner(System.in);
    private String nome = "Alessandro";
    private String nascimento = "28.04.2001";
    private float altura = 1.7f;

    /*
        Crie uma classe para representar uma pessoa, com os atributos privados de nome, ano de nascimento e altura. \/
        Crie os métodos públicos necessários para sets e gets
        e também um método para imprimir todos dados de uma pessoa.
        Crie um método para calcular a idade da pessoa.
        Teste criando 3 instancias desta classe.
        */
    public void status(){
        System.out.printf("\n"+this.nome+" nasceu em "+this.nascimento+" e hoje tem "+this.altura+"m de altura");
    }
    public void setaltura(){
        System.out.printf("\nQual a altura nova do %s? ",this.nome);
        this.altura = input.nextFloat();
        System.out.print("\nAltura atualizada.");
    }
}
