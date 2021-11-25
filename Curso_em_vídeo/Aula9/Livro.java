package Aula9;

public class Livro implements Publicacao{
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;


    // Getter & Setter


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    // constructor:

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        setTitulo(titulo);
        setAutor(autor);
        setTotPaginas(totPaginas);
        setPagAtual(0);
        setAberto(false);
        setLeitor(leitor);
    }


    public void detalhes() {
        System.out.println("Livro{\n" +
                "titulo='" + titulo + '\n' +
                "autor='" + autor + '\n' +
                "totPaginas=" + totPaginas +
                "\npagAtual=" + pagAtual +
                "\naberto=" + aberto +
                "\nleitor=" + leitor.getNome() +
                '}');
    }


    @Override
    public void abrir() {
        setAberto(true);
    }

    @Override
    public void fechar() {
        setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if (p>getTotPaginas()){
            setPagAtual(0);
        }else {
            setPagAtual(p);
        }
    }

    @Override
    public void avancarPag() {
        setPagAtual(getPagAtual()+1);
    }

    @Override
    public void voltarPag() {
        setPagAtual(getPagAtual()-1);
    }
}
