package Aula2;
public class Caneta {
    /* Aqui declaramos os atributos do molde caneta*/
    String modelo; 
    String cor; 
    float ponta; 
    int carga;
    boolean tampada;

    void status(){ 
        System.out.println("\nEsta é a caneta");
        System.out.println("Seu modelo: " + this.modelo);
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Está tampada? "+this.tampada);
        /* 
        Aqui declaramos uma funcionalidade, cujo objetivo é printar o status da caneta
        */

    }

    void rabiscar(){

    }
    void tampar(){

    }
    void destampar(){

    }




}
