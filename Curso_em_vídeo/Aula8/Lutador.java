package Aula8;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // getter & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacinalidade) {
        this.nacionalidade = nacinalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (getPeso()<52){
            this.categoria = "Inválido";
        }else if (getPeso()<70.3 && getPeso()>=52){
            this.categoria = "Peso Leve";
        }else if(getPeso()>=70.3 && getPeso()<=83.9){
            this.categoria = "Peso Médio";
        }else if (getPeso()>83.9 && getPeso()<=120.8){
            this.categoria = "Peso pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    // constructor:

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        setNome(nome);
        setNacionalidade(nacionalidade);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        setVitorias(vitorias);
        setDerrotas(derrotas);
        setEmpates(empates);
    }

    // Métodos especiais:
    public void ganharLuta(){
        setVitorias(getVitorias()+1);
    }
    public void perderLuta(){
        setDerrotas(getDerrotas()-1);
    }
    public void empatarLuta(){
        setEmpates(getEmpates()+1);
    }

    public void apresentar(){
        System.out.println("Lutador: "+getNome());
        System.out.println("Origem: "+ getNacionalidade());
        System.out.println(getIdade()+" anos");
        System.out.println(getAltura()+"m de Altura");
        System.out.println("Pesando "+getPeso()+" Kg");
        System.out.println("Categoria: "+getCategoria());
        System.out.println("Vitórias: "+getVitorias());
        System.out.println("Derrotas: "+getDerrotas());
        System.out.println("Empates: "+getEmpates());
    }

    public void status(){
        System.out.println(getNome()+ "é um "+getCategoria()+" com as seguintes estatísticas:");
        System.out.println("Vitórias: "+getVitorias());
        System.out.println("Derrotas: "+getDerrotas());
        System.out.println("Empates: "+getEmpates());
    }
}
