// Developed by Alessandro Maciel Schmidt
package com.pucpr.aula2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Exercício 1 - Crie um programa que o usuário entre com dois números e diga qual o maior;
        System.out.print("Digite o primeiro número: ");
        Scanner input = new Scanner(System.in);
        int num1 = -1;
        while (num1==-1){
            try {
                num1= input.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Favor digitar apenas número!");
                input.next();
            }
        }
        System.out.print("Entre com o segundo número: ");
        int num2 = -1;
        while (num2==-1){
            try {
                num2 = input.nextInt();
            }catch(InputMismatchException e){
                System.out.print("Favor digitar apaenas números");
                input.next();
            }
        }
        if (num1>num2){
            System.out.printf("O primeiro número é maior que o segundo. \n"+num1+ ">"+num2);
        }
        else if(num2>num1){
            System.out.printf("O segundo número é maior que eo primeiro\n"+num1+">"+num2);
        }
        else{
            System.out.println("Os dois números são iguais\n"+num1+"="+num2);
        }

    }
}
