package src.com.pucpr.lista1;

import java.util.Scanner;

public class Lista1 {
    public void exercício1(){
         /*
        Faça um programa que receba dois números. Calcule e mostre:
        1. A soma dos números ímpares desse intervalo de números, incluindo os números digitados;
        2. A multiplicação dos números pares desse intervalo, incluindo os digitados.
        * */
        int num1, num2, soma=0,multiplicação=1;
        Scanner scanner = new Scanner(System.in);
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
        
    }

}
