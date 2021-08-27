package src.com.pucpr.lista2;

import java.lang.invoke.StringConcatFactory;
import java.util.Date;
import java.util.Scanner;
// Esta é a lista 2 de exercícios;
/*
        Crie uma classe para representar uma pessoa, com os atributos privados de nome, ano de nascimento e altura. \/
        Crie os métodos públicos necessários para sets e gets
        e também um método para imprimir todos dados de uma pessoa. \/
        Crie um método para calcular a idade da pessoa.
        Teste criando 3 instancias desta classe.*/
public class Pessoa {
    Scanner input = new Scanner(System.in);
    private String nome = "Alessandro";
    private int nascimento = 2001;
    private double altura = 1.7f;

    //Constructor:
    public Pessoa(){
        System.out.println("Constructor called");
    }
    public Pessoa(String nome){
        this.nome = nome;
    }
    public Pessoa(String nome, int nascimento, double altura){
        this.nome = nome;
        this.nascimento = nascimento;
        this.altura = altura;
    }

    public String getNome(){
        return nome;
    }
    public int getnascimento(){
        return nascimento;
    }
    public double getAltura() {
        return altura;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNascimento(int nascimento){
        this.nascimento = nascimento;
    }
    public void setAltura(double altura){
        if(altura>0.0){
            this.altura = altura;
        }
    }
    public void status(){
        System.out.printf("\n%s nasceu em %d e hoje tem %.2f m de altura.\nEle tem %d anos", this.nome,this.nascimento, this.altura,getIdade(2021));
    }
    public int getIdade(int anoAtual){
        return anoAtual - this.nascimento;
    }

}
