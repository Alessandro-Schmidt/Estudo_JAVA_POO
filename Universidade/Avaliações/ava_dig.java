import java.util.Scanner;

import java.util.InputMismatchException;

public class ava_dig {
    public static void main(String[] args) {
        System.out.println("Exercício 1 - Número maior ou menor.");
        Scanner input = new Scanner(System.in);
        int num1 = -1;
        while (num1==-1);{
        try {
            System.out.print("Digite o primeiro número: ");
            num1 = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Digite um valor válido!");
            input.next();
        }
        }
        System.out.println(num1);
    }
}