package templatemethod;

public class Advogado extends Trabalhador{

	protected void trabalhar() {
		System.out.println("Trabalhando como advogado");
	}
	
	protected void levantar() {
		System.out.println("Levantando da cama as 08hr");
	}
	
	protected void voltarParaCasa() {
        System.out.println("Voltar para casa de carro");
    }
}
