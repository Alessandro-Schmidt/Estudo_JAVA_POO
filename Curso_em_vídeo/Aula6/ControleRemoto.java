package Aula6;

public class ControleRemoto implements Controlador {
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Getter e Setter
    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Constructor:
    public ControleRemoto(){
        setVolume(50);
        setLigado(false);
        setTocando(false);
    }
    // Métodos abstratos

    @Override // Desconsidero o que foi feito, e programa aqui
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (getLigado()){
            System.out.println("----- MENU -----");
            System.out.println("Está ligado? "+ this.getLigado());
            System.out.println("Está tocando? "+this.getTocando());
            System.out.println("Volume: "+ this.getVolume());
            for (int i = 0; i<= this.getVolume(); i+=10){
                System.out.print("I");
        }
            System.out.println("\n----------------");
        } else{
            System.out.println("A Televisão está desligada.");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (getLigado() && getVolume()<100){
            setVolume(getVolume()+5);
        } else{
            System.out.println("Ou a Televisão está desligada, ou o volume já está no máximo");
        }
    }

    @Override
    public void menosVolume() {
        if (getLigado() && getVolume()>0){
            setVolume(getVolume()-1);
        }else{
            System.out.println("Volume já está em "+ getVolume());
        }
    }

    @Override
    public void ligarMudo() {
        if (getLigado() && getVolume()>0){
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (getLigado() && getVolume()==0){
            setVolume(50);
        }
    }

    @Override
    public void play() {
        if (getLigado() && !(getTocando())){
            setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (getLigado() && getTocando()){
            setTocando(false);
        }
    }

    // Métodos Abstratos:

}
