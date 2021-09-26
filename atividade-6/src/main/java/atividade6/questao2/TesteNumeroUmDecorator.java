package atividade6.questao2;


public class TesteNumeroUmDecorator {
	
	public static void main(String[] args) {
		ImpressoraDeNumero numeroUmComChaves = new NumeroUmComChaves(new NumeroUm());
		numeroUmComChaves.imprimir();
		System.out.println("");

		ImpressoraDeNumero numeroUmComColchetes = new NumeroUmComColchetes(new NumeroUm());
		numeroUmComColchetes.imprimir();
		System.out.println("");

		ImpressoraDeNumero numeroUmComParenteses = new NumeroUmComParenteses(new NumeroUm());
		numeroUmComParenteses.imprimir();
		System.out.println("");
		
		ImpressoraDeNumero numeroCompleto = new NumeroUmComChaves(new NumeroUmComColchetes(new NumeroUmComParenteses(new NumeroUm())));
		numeroCompleto.imprimir();
		System.out.println("");

		ImpressoraDeNumero numero2Completo = new NumeroUmComChaves(new NumeroUmComColchetes(new NumeroUmComParenteses(new NumeroDois())));
		numero2Completo.imprimir();
		System.out.println("");
	}

}
