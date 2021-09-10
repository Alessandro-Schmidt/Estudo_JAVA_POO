package src.com.pucpr.EstudoProva.Exercício2;

public class Empregado {
    private String nome;
    private String Sobrenome;
    private Float Salário;

    // Métodos especiais:
    public void getAumento(){
        setSalário(getSalário()*1.1f);
       System.out.print("\nAumento de 10% para o "+this.getNome()+"\n");
    }

    public void Status(){
        System.out.println("-------------------------------");
        System.out.printf("Empregado %s %s\nSalário: R$%.2f\n", this.getNome(), this.getSobrenome(),this.getSalário());
        System.out.println("-------------------------------");
    }

    // Constructor
    public Empregado(String nome, String sobrenome, Float salário) {
        this.nome = nome;
        Sobrenome = sobrenome;
        Salário = salário;
        if (Salário <0){
            this.setSalário(0f);
        }
    }

    // Getter e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }

    public Float getSalário() {
        return Salário;
    }

    public void setSalário(Float salário) {
        Salário = salário;
    }
}
