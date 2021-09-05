package Aula4;

public class Celular {
    private int numero;
    private String modelo;

    public void status(){
        System.out.printf("\nEste é o celular de modelo %s, o número desse telefone é %d\n", modelo,numero);
    }

    public Celular() {
    }

    public Celular(int numero, String modelo) {
        this.numero = numero;
        this.modelo = modelo;
    }
    
}
