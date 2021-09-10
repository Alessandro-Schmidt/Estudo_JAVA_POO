package Aula5;

public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    // Métodos Personalizados:
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t=="CC"){
            this.setSaldo(50);
        }else if (t == "CP"){
            this.setSaldo(150);
        }
    }

    public void estadoAtual(){
        System.out.println("Conta: "+ this.getNumConta());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: R$"+this.getSaldo());
        System.out.println("Está aberta: "+this.isStatus());
    }

    public void fecharConta(){
        if (this.getSaldo()>0){
            System.out.print("\nEsta conta ainda tem dinheiro\nSaque todo o dinheiro, e poderá fechá-la.");
        }else if(this.getSaldo()<0){
            System.out.print("\nEsta conta ainda tem débitos\nDeposite o valor faltante para fechar a conta");
        }else{
            this.setStatus(false);
            System.out.print("\nConta fechada com sucesso");
        }
    }

    public void depositar(float v){
        if (this.isStatus()){
            this.setSaldo(this.getSaldo()+v);
            System.out.printf("Você depositou %f, seu saldo é de:\nR$ %f\n",v, getSaldo());
        }else{
            System.out.println("\nImpossível depositar em conta fechada.\n");
        }
    }

    public void sacar(float v){
        if (this.isStatus()){
            if (this.getSaldo()>=v){
                this.setSaldo(getSaldo()-v);
                System.out.printf("Você sacou %f, seu saldo é de:\nR$ %f\n",v, getSaldo());
            }else{
                System.out.print("Você não possui este valor na sua conta.\n");
            }
        }else{
            System.out.println("Sua conta está fechada.");
        }
    }

    public void pagarMensal(){
        int v = 0;
        if (this.getTipo()=="CC"){
            v = 12;
            if (this.isStatus()){
                this.setSaldo(this.getSaldo()-v);
                System.out.printf("Você pagou a mensalidade de conta Corrente. R$ %d,00\nSeu saldo: %f",v,this.getSaldo());
            }else{
                System.out.print("Sua conta está fechada");
            }
        }else if (this.getTipo()=="CP"){
            v = 20;
            if (this.isStatus()){
                this.setSaldo(this.getSaldo()-v);
                System.out.printf("Você pagou a mensalidade de conta Corrente. R$ %d,00\nSeu saldo: %f",v,this.getSaldo());
            }else{
                System.out.print("Sua conta está fechada");
            }
        }else{
            System.out.print("\nTipo de conta inválido\n");
        }
    }
    // Métodos Especiais:
    // Constructors:
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }
    // Getters e Setters:

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}