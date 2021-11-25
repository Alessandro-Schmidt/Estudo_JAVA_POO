package Aula9;

public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];

        p[0] = new Pessoa("Alessandro",20, "M");
        p[1] = new Pessoa("Schmidt",30,"M");

        l[0] = new Livro("O que devemos uns aos outros", "T. M. Scalon", 2000,p[0]);
        l[1] = new Livro("Justiça, o que é fazer a coisa certa","Michael Sandel", 300,p[0]);
        l[2] = new Livro("A Revolta de Atlas", "Ayn Rand", 1215,p[1]);

        l[0].abrir();
        l[0].folhear(50);
        l[0].detalhes();

    }
}
