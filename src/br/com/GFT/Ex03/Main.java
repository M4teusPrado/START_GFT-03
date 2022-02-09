package br.com.GFT.Ex03;

public class Main {

    public static void main(String[] args) {


        //Instanciando "biblioteca"
        Livro livro01 = new Livro(1,"Código limpo", 434);
        Livro livro02 = new Livro(2,"Introdução a programação", 224);
        Livro livro03 = new Livro(3,"Java efetivo", 305);
        Livro livro04 = new Livro(4,"Pense em Python", 420);
        Livro livro05 = new Livro(5,"POO principios", 602);


        //Intanciando Leitor
        Leitor leitor01 = new Leitor("Clecio",livro01 );
        leitor01.adicionarLivro(livro02);
        leitor01.adicionarLivro(livro03);
        leitor01.removerLivro(livro03);

        //Exibe Estante
        leitor01.getEstantesLivros().forEach(livro -> {
            System.out.println(livro.getId());
        });


        livro01.setPaginasLidas(23);
        livro01.adicionarPaginasLidas();

        System.out.println(livro01.verificaProgresso());



    }
}
