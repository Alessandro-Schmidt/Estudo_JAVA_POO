package Aula6;

public class ControleRemoto implements Controlador {
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Getter e Setter
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
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
        System.out.println("Está ligado? "+ this.getLigado());
        System.out.println("Está tocando? "+this.getTocando();
        System.out.println("Volume: "+ this.getVolume());
        for (int i = 0; i<= this.getVolume(); i+=10){
            System.out.println("I");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (getLigado() && getVolume()<10){
            setVolume(getVolume()+1);
        }
    }

    @Override
    public void menosVolume() {
        if (getLigado() && getVolume()>0){
            setVolume(getVolume()-1);
        }
    }

    @Override
    public void ligarMudo() {
        
    }

    @Override
    public void desligarMudo() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    // Métodos Abstratos:

}
