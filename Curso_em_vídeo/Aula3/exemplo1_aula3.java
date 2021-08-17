package Aula3;

public class exemplo1_aula3 {
    public static void main(String[] args) {
        Canetinha c1 = new Canetinha();
        c1.modelo = "MontBlanc";
        c1.cor = "Azul";
        // c1.ponta --> Possui um acesso privado! Não pode ser acessado, ou modificado.
        c1.carga=80; // Ele permite que haja uma mudança no atributo protegido carga,
        // pois dentro do método main, há uma classe que utiliza a classe caneta.
        // é permitido, quando um atributo protegido está dentro de um método que use a classe canetinha.
        //c1.tampada = false; --> Atributo privado;
        // c1.rabiscar() --> Também não é possível (Método privado).
        /*Repare que tampada, é um atributo privado, contudo, o método tampar() e destampar() que
         dá acesso a este atributo, é público.*/
        c1.tampar(); // O método tampar consegue mexer no atributo privado tampada, uma vez que pertence a mesma classe.
        c1.status();


    }
}
