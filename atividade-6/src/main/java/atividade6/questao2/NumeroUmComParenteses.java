package atividade6.questao2;

public class NumeroUmComParenteses extends NumeroUmDecorator {
	
	public NumeroUmComParenteses(ImpressoraDeNumero numero) {
		super(numero);
	}
	
	public String getMensagem() {
		String numeroComParenteses = "(" + 	this.getImpressao().getMensagem() + ")";
		return numeroComParenteses;
	}

}
