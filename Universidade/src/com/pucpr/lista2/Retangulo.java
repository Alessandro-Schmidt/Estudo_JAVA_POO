package src.com.pucpr.lista2;

public class Retangulo {
    private double largura;
    private double altura;
    private double x;
    private double y;

    public Retangulo(double largura, double altura, double x, double y) {
        this.largura = largura;
        this.altura = altura;
        this.x = x;
        this.y = y;
    }


    public double getPerimetro(){
        return 2*(largura+altura);
    }
    public double getArea(){
        return largura*altura;
    }
    public void status(){
        System.out.println("Retângulo ("+x+", "+y+") de tamanho "+ largura+" por "+altura);
        System.out.println("Area: "+getArea());
        System.out.println("Perímetro: "+getPerimetro());
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
