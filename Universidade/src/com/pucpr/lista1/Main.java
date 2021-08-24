package src.com.pucpr.lista1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista1 lista1 = new Lista1();
        while (true){
            System.out.print("\nMENU DA LISTA 1!\n");
            System.out.println("[1] - Exercício 1;");
            System.out.println("[2] - Exercício 2;");
            System.out.println("[3] - Exercício 3;");
            System.out.println("[4] - Exercício 4;");
            System.out.println("[5] - Exercício 5;");
            System.out.println("[6] - Sair;");
            System.out.print("Sua opção: ");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    lista1.exercicio1();
                    break;
                case 2:
                    lista1.exercicio2();
                    break;
                case 3:
                    lista1.exercicio3();
                    break;
                case 4:
                    lista1.exercicio4();
                    break;
                case 5:
                    lista1.exercicio5();
                    break;
                case 6:
                    return;
            }
        }
        //lista1.exercicio1();
        //lista1.exercicio2();
        //lista1.exercicio3();

    }
}
