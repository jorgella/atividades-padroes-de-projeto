package br.edu.ifma.padroesprojeto.etapa1.atiivdade3.questao5;

import java.util.List;

public class Livro {

    private final String nome;
    private final String nomeOriginal;
    private final String editora;
    private final int edicao;
    private final int paginas;
    private final long isbn;
    private final String cidade;
    private final int ano;
    private final List<String> autores;
    private final List<String> tradutores;

    private Livro(String nome,
                  String nomeOriginal,
                  String editora,
                  int edicao,
                  int paginas,
                  long isbn,
                  String cidade,
                  int ano,
                  List<String> autores,
                  List<String> tradutores) {
        this.nome = nome;
        this.nomeOriginal = nomeOriginal;
        this.editora = editora;
        this.edicao = edicao;
        this.paginas = paginas;
        this.isbn = isbn;
        this.cidade = cidade;
        this.ano = ano;
        this.autores = autores;
        this.tradutores = tradutores;

    }

    public String getNome() {
        return nome;
    }

    public String getNomeOriginal() {
        return nomeOriginal;
    }

    public String getEditora() {
        return editora;
    }

    public int getEdicao() {
        return edicao;
    }

    public int getPaginas() {
        return paginas;
    }

    public long getIsbn() {
        return isbn;
    }

    public String getCidade() {
        return cidade;
    }

    public int getAno() {
        return ano;
    }

    public List<String> getAutores() {
        return autores;
    }

    public List<String> getTradutores() {
        return tradutores;
    }

    public static class LivroBuilder {

        private final String nome;
        private String nomeOriginal;
        private String editora;
        private int edicao;
        private int paginas;
        private long isbn;
        private String cidade;
        private int ano;
        private List<String> autores;
        private List<String> tradutores;

        public LivroBuilder(String nome) {
            this.nome = nome;
        }

        public LivroBuilder nomeOriginal(String nomeOriginal) {
            this.nomeOriginal = nomeOriginal;
            return this;
        }

        public LivroBuilder editora(String editora) {
            this.editora = editora;
            return this;
        }

        public LivroBuilder edicao(int edicao) {
            this.edicao = edicao;
            return this;
        }

        public LivroBuilder paginas(int paginas) {
            this.paginas = paginas;
            return this;
        }

        public LivroBuilder isbn(Long isbn) {
            this.isbn = isbn;
            return this;
        }

        public LivroBuilder cidade(String cidade) {
            this.cidade = cidade;
            return this;
        }

        public LivroBuilder anoDePublicacao(int ano) {
            this.ano = ano;
            return this;
        }

        public LivroBuilder autores(String... autores) {
            this.autores = List.of(autores);
            return this;
        }

        public LivroBuilder tradutores(String... tradutores) {
            this.tradutores = List.of(tradutores);
            return this;
        }

        public Livro build() {
            return new Livro(nome,
                             nomeOriginal,
                             editora,
                             edicao,
                             paginas,
                             isbn,
                             cidade,
                             ano,
                             autores,
                             tradutores);
        }

    }

}
