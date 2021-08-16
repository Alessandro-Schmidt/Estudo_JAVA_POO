// Developed by Alessandro Maciel Schmidt
package com.pucpr.aula2;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	// Exercício 1 - Crie um programa que o usuário entre com dois números e diga qual o maior;
        /*
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
            // Quando usamos o comando printf, temos que declarar ao invés de apenas qual a variável dentro de um {},
            // devemos especificar seu tipo, depois com uma vírgula, qual variável aquele tipo pertence
            // %d = int
            // %f = float
            // %s = string
            // usw.
        }
         */
        // Exercício 2 - crie um programa onde o usuário entre com o número de dias e ele converta para
        // o número de segundos
        /*
        Scanner input = new Scanner(System.in);
        int dias = 0;
        while (dias==0){
            try{
                System.out.print("Digite o número de dias: ");
                dias = input.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Digite apenas números");
                input.next();
            }
        }
        int segundos = dias * 24*60*60;
        System.out.print(dias+" dias equivalem a "+segundos+" segundos.");*/

        // Exercício 3 - Crie um programa de número par ou ímpar;
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int var1 = input.nextInt();
        if (var1%2==0){
            System.out.print("O número " + var1 + " é par.");
        }else{
            System.out.print("O número "+var1+" é ímpar.");
            input.next();
        }

        // Exercício 4 -  Crie um programa que o usuário digite três num e ele imprima a média deles
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = input.nextInt();
        float media = (num1+num2+num3)/3.0f; //Apenas dividindo todos os inteiros por um float, teremos um número float de resultade
        System.out.printf("A média %d + %d + %d é %f",num1,num2,num3,media);

        // Exercício 5 - Crie um programa que imprima os num de 1 a 10;
        for (int i =1; i<=10;i++){
            System.out.println(i);
        }
        */
        // Exercício 6 - Pergunte um número e devolva seu fatorial.
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = input.nextInt();
        int fatorial = 1;
        if (num<0){
            System.out.print("O número deve ser positivo.");
        }else if (num==0){
            System.out.print("O fatorial de "+num+" é "+fatorial);
        }else{
            for (int i =1; i<=num; i++){
                fatorial*=i;
            }
        }
        System.out.print("O fatorial de "+num+" é "+fatorial);
    }
}