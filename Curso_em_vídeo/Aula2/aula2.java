package Aula2;

public class aula2 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta(); /*Aqui criamos uma nova caneta de nome c1.*/
        c1.cor = "Azul";
        c1.carga = 100;
        c1.modelo = "MontBlanc";
        c1.valor = 2;
        //c1.tampada = false;
        c1.tampar();
        //c1.status(); // Aqui chamamos o comando status, que printa todo o status da caneta.
        //c1.rabiscar(); // Dá erro, pois tampamos a caneta lá em cima;
        //c1.destampar(); // Destampamos ela aqui;
        //c1.status(); // Pedimos o status dela, vemos que está destampada;
        //c1.rabiscar(); // E agora o rabiscar funciona

        Caneta Shakespierre = new Caneta();
        Shakespierre.modelo="500 anos de William Shakespeare";
        Shakespierre.cor="Vermelha com azul, cores da bandeira Britânica";
        Shakespierre.carga=100;
        Shakespierre.valor=10000;
        Shakespierre.carga = 100;
        Shakespierre.tampar();
        Shakespierre.status();
        Shakespierre.rabiscar();
        Shakespierre.destampar();
        Shakespierre.rabiscar();
        

    }
}
