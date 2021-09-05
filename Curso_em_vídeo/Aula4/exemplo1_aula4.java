package Aula4;

import java.util.Scanner;
public class exemplo1_aula4 {

    public static void exemplo01(){
        Celular iPhone = new Celular();
        iPhone.status();
        iPhone.setNumero(1298734);
        iPhone.setModelo("SchmidtPhone");
        iPhone.status();
        System.out.printf("\nEste modelo (%s) possui um chip com o número: %d\n",iPhone.getModelo(),iPhone.getNumero());
    }

    public static void exemplo02(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número do seu Telefone: ");
        int num = input.nextInt();
        System.out.println("Digite o modelo do Telefone: ");
        String modelo = input.next();
        Celular Zen = new Celular(num, modelo);
        Zen.status();
    }


    public static void main(String[] args) {
        exemplo01();
        exemplo02();
    }
}

