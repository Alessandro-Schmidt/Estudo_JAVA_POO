package Aula8;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    //Getter e Setter

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)){
            setDesafiado(l1);
            setDesafiante(l2);
            setAprovada(true);
        }else{
            setAprovada(false);
            setDesafiado(null);
            setDesafiante(null);
        }
    }
    public void lutar(){
        if (this.aprovada){
            System.out.println("##DESAFIANTE##");
            this.desafiante.apresentar();
            System.out.println("##DESAFIADO##");
            this.desafiado.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor){
                case 0:
                    System.out.println("EMPATOU!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Vencedor: "+ desafiado.getNome());
                    desafiado.ganharLuta();
                    System.out.println("Perdedor: "+desafiante.getNome());
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Vencedor: "+ desafiante.getNome());
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    System.out.println("Perdedor: "+ desafiado.getNome());
                    break;
            }
        }else{
            System.out.println("A luta não pode acontecer.");
        }
    }

}
