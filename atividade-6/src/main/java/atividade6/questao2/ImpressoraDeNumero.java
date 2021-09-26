package atividade6.questao2;

public abstract class ImpressoraDeNumero {

	public abstract String getMensagem();

	public final void imprimir() {
		System.out.println(this.getMensagem());
	}

}
