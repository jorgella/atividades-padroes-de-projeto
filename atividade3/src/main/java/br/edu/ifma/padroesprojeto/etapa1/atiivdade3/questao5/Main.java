package br.edu.ifma.padroesprojeto.etapa1.atiivdade3.questao5;

public class Main {

    public static void main(String[] args) {
        var livro = new Livro.LivroBuilder("O iluminado")
                               .anoDePublicacao(2012)
                               .autores("Machado de Assis", "Stephen King")
                               .edicao(1)
                               .cidade("Poirtland")
                               .editora("Suma")
                               .nomeOriginal("The shinning")
                               .tradutores("Betty Ramos de Albuquerque")
                               .paginas(464)
                               .isbn(1234L)
                               .build();

        assert livro.getNome().equals("O iluminado");
        assert livro.getAno() == 2012;
        assert livro.getAutores().size() == 2;
        assert livro.getAutores().contains("Machado de Assis");
        assert livro.getAutores().contains("Stephen King");
        assert livro.getEdicao() == 1;
        assert livro.getCidade().equals("Portland");
        assert livro.getEditora().equals("Suma");
        assert livro.getNomeOriginal().equals("The shinning");
        assert livro.getTradutores().size() == 1;
        assert livro.getTradutores().contains("Betty Ramos de Albuquerque");
        assert livro.getPaginas() == 464;
        assert livro.getIsbn() == 1234L;

        System.out.println("Livro criado com sucesso");
    }

}
