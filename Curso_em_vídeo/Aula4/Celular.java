package Aula4;

public class Celular {
    private int numero;
    private String modelo;

    public void status(){
        System.out.printf("\nEste é o celular de modelo %s, o número desse telefone é %d\n", modelo,numero);
    }

    public Celular() {
    }
    // O constructor vazio serve para adequar às possíveis variáveis de um objeto valores null ou 0

    public Celular(int numero, String modelo) {
        this.numero = numero;
        this.modelo = modelo;
    }

    public int getNumero() {
        return numero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
