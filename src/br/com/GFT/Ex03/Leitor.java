package br.com.GFT.Ex03;


import java.util.*;

public class Leitor {

    private String nome;
    private Livro LivroFavorito;
    private List<Livro> estantesLivros = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Livro getLivroFavorito() {
        return LivroFavorito;
    }

    public void setLivroFavorito(Livro livroFavorito) {
        LivroFavorito = livroFavorito;
    }



    public List<Livro> getEstantesLivros() {
        return estantesLivros;
    }

    public void adicionarLivro(Livro livro) {
        estantesLivros.add(livro);
    }

    public void removerLivro(Livro livro) {
        livro.setPaginasLidas(0);
        estantesLivros.remove(livro);
    }

    public Leitor(String nome, Livro livroFavorito) {
        this.nome = nome;
        LivroFavorito = livroFavorito;
        adicionarLivro(LivroFavorito);
    }




}
