package Aula2;

public class aula2 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta(); /*Aqui criamos uma nova caneta de nome c1.*/
        c1.cor = "Azul";
        c1.carga = 100;
        c1.modelo = "MontBlanc";
        c1.tampada = false;
        c1.status(); // Aqui chamamos o comando status, que printa todo o status da caneta.
    }
}
