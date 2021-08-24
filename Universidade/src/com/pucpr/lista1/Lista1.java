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
        /*
        Faça um programa que apresente um menu de opções (no terminal) para o calculo das seguintes operações entre dois
         números: adição (opção 1) ;subtração (opção 2); multiplicação (opção 3); divisão (opção 4); sair (opção 5).
         O programa deve possibilitar ao usuário a escolha da operação desejada, entrada dos números e a exibição
        do resultado e a volta ao menu de opções. O programa só termina quando for escolhida a opção de saída (opção 5).
        */
        while (true){
            System.out.println("\nMENU DE CÁLCULOS");
            System.out.println("[1] - Adição");
            System.out.println("[2] - Subtração");
            System.out.println("[3] - Multiplicação");
            System.out.println("[4] - Divisão");
            System.out.println("[5] - Sair");
            System.out.print("Sua escolha: ");
            Scanner scanner = new Scanner(System.in);
            int escolha = scanner.nextInt();
            float numA, numB;
            switch (escolha){
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    numA = scanner.nextInt();
                    System.out.print("\nDigite o segundo número: ");
                    numB = scanner.nextInt();
                    float soma = numA+numB;
                    System.out.printf("O resultado da soma de %.2f e %.2f é %.2f\n", numA,numB,soma);
                    break;
                case 2:
                    System.out.print("Digite o primeiro número: ");
                    numA = scanner.nextInt();
                    System.out.print("\nDigite o segundo número: ");
                    numB = scanner.nextInt();
                    float subtracao = numA-numB;
                    System.out.printf("O resultado da subtração de %.2f e %.2f é %.2f\n", numA,numB,subtracao);
                    break;
                case 3:
                    System.out.print("Digite o primeiro número: ");
                    numA = scanner.nextInt();
                    System.out.print("\nDigite o segundo número: ");
                    numB = scanner.nextInt();
                    float multi = numA*numB;
                    System.out.printf("O resultado da multiplicação entre %.2f e %.2f é %.2f\n", numA,numB,multi);
                    break;
                case 4:
                    System.out.print("Digite o primeiro número: ");
                    numA = scanner.nextInt();
                    System.out.print("\nDigite o segundo número: ");
                    numB = scanner.nextInt();
                    float divisao = numA/numB;
                    System.out.printf("O resultado da divisão de %.2f por %.2f é %.2f\n", numA,numB,divisao);
                    break;
                case 5:
                    return;
            }
        }
    }
    public void exercicio5(){

    }

}
