package br.edu.ifma.padroessoftware.etapa3.atv1.questao6;

public abstract class Documento {

    private Long id;
    private String titulo;
    private String descricao;
    protected final Formatacao formatacao;

    public Documento(Long id, String titulo, String descricao, Formatacao formatacao) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.formatacao = formatacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    abstract public String formatar();

    @Override
    public String toString() {
        return formatar();
    }

}
