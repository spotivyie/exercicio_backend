package anotation;

import java.lang.annotation.Annotation;

public class Chave {
	
	public static void main(String args[]) {
		leituraAnotacao();
		leituraClasse();
	}

	private static void leituraAnotacao() {
		System.out.println("** Anotação **");
		Tabela prod = new Tabela();
		Annotation[] annotations = prod.getClass().getAnnotations();
		for (Annotation an : annotations) {
			System.out.println("annotations type: " +  an.annotationType());
		}
	}
	
	private static void leituraClasse() {
		System.out.println("** Classe **");
		Class prodC = Tabela.class;
		System.out.println(prodC);
	}
	
}

