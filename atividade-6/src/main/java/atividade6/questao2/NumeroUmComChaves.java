package atividade6.questao2;

public class NumeroUmComChaves extends NumeroUmDecorator{
	
	public NumeroUmComChaves (ImpressoraDeNumero numero) {
		super(numero);
	}
	
	public String getMensagem() {
		String numeroComChaves = "{" + 	this.getImpressao().getMensagem() + "}";
		return numeroComChaves;
	}

}
