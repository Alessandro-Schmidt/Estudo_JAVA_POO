package Aula3;

public class Canetinha {
    // nesta aula, tratamos de visibilidade de atributos de um objeto.
    /*a visibilidade pode ser: Pública, privada ou protegida*/
    public String modelo;
    public int valor;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

    public void status(){
        System.out.println("\nEsta é a caneta ");
        System.out.println("Seu modelo: " + this.modelo);
        System.out.println("Seu preço: R$ "+this.valor);
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Está tampada? "+this.tampada);
        System.out.println("A carga dela está em "+this.carga+"%");
        System.out.println("<<<<<<<<<<<");
        /*
        Aqui declaramos uma |Método| (funcionalidade), cujo objetivo é printar o status da caneta
        */

    }

    public void rabiscar(){ // outro método
        if (this.tampada ==true){ // IMPORTANTE: ESTRUTURA IF E ELSE;
            System.out.println("Eita! Eu não consigo rabiscar com a caneta tampada!");
        } else{
            System.out.println("Rabisquei uma coisa no meu caderno!");
        }

    }
    protected void tampar(){
        this.tampada = true; // This significa o objeto que foi chamado, pois o comando ficará: Referência ao objeto que o chamou;
        // Objeto c1.tampar()
        //Sacaste?

    }
    protected void destampar(){
        System.out.println("Destampei! Agora posso usar.");
        this.tampada = false;
    }
}
