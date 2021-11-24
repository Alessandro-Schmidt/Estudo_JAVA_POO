package Aula7;

public class emojiCombat {
    public static void main(String[] args) {
        //Lutador a = new Lutador("Schmidt","Alemanha", 20, 2.15f, 80.4f, 4,0,1);
        //a.status();
        //a.apresentar();
        //Lutador b = new Lutador("Jerry Seinfeld", "Americana", 44,1.74f, 78.4f, 2,4,1)
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Schmidt","Alemanha", 20, 2.15f, 80.4f, 4,0,1);
        l[1] = new Lutador("Jerry Seinfeld", "Americana", 44,1.74f, 78.4f, 2,4,1);
        l[2] = new Lutador("George Costanza", "Panama", 66,1.5f,81.9f,1,8,9);
        l[3] = new Lutador("Eleanor", "Americana", 44,1.74f, 68.4f, 2,4,1);
    }

}
