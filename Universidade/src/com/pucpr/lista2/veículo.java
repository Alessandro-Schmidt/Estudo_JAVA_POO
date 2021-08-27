package src.com.pucpr.lista2;

public class veículo {
    private String cor, marca, modelo;
    private int ano,numPassageiros;
    private double maxCapacidadeTanque, litrosTanque, kmPorLitro;
    // Criado automáticamente pelo IntelliJ
    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getNumPassageiros() {
        return numPassageiros;
    }

    public double getMaxCapacidadeTanque() {
        return maxCapacidadeTanque;
    }

    public double getLitrosTanque() {
        return litrosTanque;
    }

    public double getKmPorLitro() {
        return kmPorLitro;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setNumPassageiros(int numPassageiros) {
        this.numPassageiros = numPassageiros;
    }

    public void setMaxCapacidadeTanque(double maxCapacidadeTanque) {
        this.maxCapacidadeTanque = maxCapacidadeTanque;
    }

    public void setLitrosTanque(double litrosTanque) {
        this.litrosTanque = litrosTanque;
    }

    public void setKmPorLitro(double kmPorLitro) {
        this.kmPorLitro = kmPorLitro;
    }

    public veículo(String cor, String marca, String modelo, int ano, int numPassageiros, double maxCapacidadeTanque, double litrosTanque, double kmPorLitro) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.numPassageiros = numPassageiros;
        this.maxCapacidadeTanque = maxCapacidadeTanque;
        this.litrosTanque = litrosTanque;
        this.kmPorLitro = kmPorLitro;
    }
}
