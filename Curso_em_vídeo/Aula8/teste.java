package Aula8;

public class teste {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[2];
        l[0] = new Lutador("Ale", "Argentina",22, 2.0f,88.4f,3,6,6);
        l[1] = new Lutador("Paulo", "Líbano",22, 2.0f,88.4f,4,7,8);

        Luta UFCMIDT = new Luta();
        UFCMIDT.marcarLuta(l[0],l[1]);
        UFCMIDT.lutar();

    }
}
