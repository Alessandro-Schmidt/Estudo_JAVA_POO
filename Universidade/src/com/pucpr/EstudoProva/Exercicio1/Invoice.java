package src.com.pucpr.EstudoProva.Exercicio1;

import java.util.Locale;

public class Invoice {
    private int numItem;
    private String descricao;
    private int qtddComprada;
    private float precoUnitario;

    // Método status()
    public void status(){
        System.out.println("------------------");
        System.out.println("Código do produto: "+this.getNumItem());
        System.out.println("Descrição: "+this.getDescricao());
        System.out.println("Quantidade comprada: "+this.getQtddComprada());
        String preco = String.format(Locale.FRENCH, "%.2f", getPrecoUnitario()); // Esse comando formata para o formato de dinheiro do BR, no caso, o da frança é igual ao do BRasil
        String precoTotal = String.format(Locale.FRENCH, "%.2f", getInvoiceAmount());
        System.out.println("Preço / Unidade: R$ "+preco);
        System.out.printf("Valor final: R$"+ precoTotal+ "\n");
        System.out.println("------------------");
    }



    // Metodos especiais
    public double getInvoiceAmount(){
        double valorNota = this.getQtddComprada()*this.getPrecoUnitario();
        return valorNota;
    }

    // Metodo constructor


    public Invoice(int numItem, String descricao, int qtddComprada, float precoUnitario) {
        this.numItem = numItem;
        this.descricao = descricao;
        this.qtddComprada = qtddComprada;
        this.precoUnitario = precoUnitario;
        if (this.qtddComprada <0){
            this.setQtddComprada(0);
        }
        if (this.precoUnitario<0){
            this.setPrecoUnitario(0);
        }
    }

    // Getters and Setters

    public int getNumItem() {
        return numItem;
    }

    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtddComprada() {
        return qtddComprada;
    }

    public void setQtddComprada(int qtddComprada) {
        this.qtddComprada = qtddComprada;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }




    /*
     1) Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de informática para representar
uma fatura de um item vendido na loja. Uma fatura deve incluir as seguintes informações como atributos:
• o número do item faturado,
• a descrição do item,
• a quantidade comprada do item
• o preço unitário do item.
Sua classe deve ter um construtor que inicialize os quatro atributos. Se a quantidade não for positiva, ela deve ser
configurada como 0. Se o preço por item não for positivo ele deve ser configurado como 0.0. Forneça um método set e um
método get para cada variável de instância. Além disso, forneça um método chamado getInvoiceAmount que calcula o valor
da fatura (isso é, multiplica a quantidade pelo preço por item) e depois retorna o valor como um double. Escreva uma
classe de teste que demonstra as capacidades da classe Invoice.
    */
}

