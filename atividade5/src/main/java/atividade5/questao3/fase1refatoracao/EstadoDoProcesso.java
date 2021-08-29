package atividade5.questao3.fase1refatoracao;


public interface EstadoDoProcesso {

    void validarProcesso() throws MudancaDeEstadoNaoMapeadaException;

    void cancelarProcesso() throws MudancaDeEstadoNaoMapeadaException;

    void designarProcesso() throws MudancaDeEstadoNaoMapeadaException;

    void deferirProcesso() throws MudancaDeEstadoNaoMapeadaException;

    void indeferirProcesso() throws MudancaDeEstadoNaoMapeadaException;

    void recorrerProcesso() throws MudancaDeEstadoNaoMapeadaException;

}
