package atividade6.questao2;

public class NumeroUmComColchetes extends NumeroUmDecorator {
	
	public NumeroUmComColchetes(ImpressoraDeNumero numero) {
		super(numero);
	}
	
	public String getMensagem() {
		String numeroComColchetes = "[" + this.getImpressao().getMensagem() + "]";
		return numeroComColchetes;
	}

}
