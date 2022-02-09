package br.com.GFT.Ex03;

public class Livro {

    private int id;
    private String titulo;
    private int qtdPagina;
    private int paginasLidas = 0;

    public int getId() {
        return id;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQtdPagina() {
        return qtdPagina;
    }

    public void setQtdPagina(int qtdPagina) {
        this.qtdPagina = qtdPagina;
    }

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public void setPaginasLidas(int paginasLidas) {
        this.paginasLidas = paginasLidas;
    }

    public double verificaProgresso() {
        return  Math.floor(paginasLidas/qtdPagina);
    }

    public  int adicionarPaginasLidas() {
        this.setPaginasLidas(this.getPaginasLidas() + 1);
        return  this.getPaginasLidas();
    }


    public Livro(int id, String titulo, int qtdPagina) {

        this.id  = id;
        this.titulo = titulo;
        this.qtdPagina = qtdPagina;
    }

    public Livro() {

    }
}
