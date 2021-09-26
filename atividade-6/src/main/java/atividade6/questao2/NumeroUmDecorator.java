package atividade6.questao2;


public abstract class NumeroUmDecorator extends ImpressoraDeNumero {

	private final ImpressoraDeNumero numero;

	public NumeroUmDecorator(ImpressoraDeNumero numero) {
		this.numero = numero;
	}

	public ImpressoraDeNumero getImpressao() {
		return this.numero;
	}

}
