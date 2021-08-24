package src.com.pucpr.lista1;

import java.util.Scanner;

public class Lista1 {
    Scanner scanner = new Scanner(System.in);
    // A linha acima faz com que todos os métodos tenham acesso ao scanner, sem a necessidade de declará-lo todas as
    // vezes. Essa variável é um atributo de classe.
    public void exercicio1(){
         /*
        Faça um programa que receba dois números. Calcule e mostre:
        1. A soma dos números ímpares desse intervalo de números, incluindo os números digitados;
        2. A multiplicação dos números pares desse intervalo, incluindo os digitados.
        * */
        int num1, num2, soma=0,multiplicação=1;

        do {
            System.out.print("Digite o primeiro número: ");
            num1 = scanner.nextInt();
            System.out.print("Digite o segundo número: ");
            num2 = scanner.nextInt();
        }while (num1>num2);
        for (int i = num1; i<=num2; i++){
            System.out.print(".."+i);
        }
        for (int i = num1; i<=num2; i++) {
            if (i%2==1){
                soma+=i;
            }else{
                multiplicação*=i;
            }
        }
        System.out.println("\nA soma dos números ímpares é: "+soma+"\nA multiplicação dos números pares deste intervalo é: "+multiplicação);
    }
    public void exercicio2(){
        /*
        Escreva um programa completo que permita a qualquer aluno introduzir, pelo teclado, uma sequência arbitrária de
        notas e que mostra na tela, como resultado, a correspondente média aritmética. O número de notas deve ser indeterminado,
        e o calculo só parará quando for introduzido um número negativo;
         */
        float soma = 0;
        int contador = 0;
        while (true){
            System.out.print("Digite uma nota (valor negativo para sair): ");
            float num = scanner.nextFloat();
            if (num<0.0f){
                break;
            }
            soma+=num;
            contador+=1;
        }
        System.out.print("A média das notas digitadas é: "+ (soma/contador));
    }
    public void exercicio3(){
        // faça um programa que calcule a soma de  todos os numeros naturais, abaixo de 1000, que sejam múltiplos de 3
        // ou 5
        int soma = 0;
        for (int i =0; i<1000;i++){
            if (i%3==0 || i%5==0 ){
                // aquele || ali em cima significa or
                soma+=i;
            }
        }
        System.out.print("A soma é: "+soma);
    }
    public void exercicio4(){
        while (true){
            System.out.print();
        }
    }
    public void exercicio5(){

    }

}
