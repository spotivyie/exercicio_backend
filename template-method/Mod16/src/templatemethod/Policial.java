package templatemethod;

public class Policial extends Trabalhador{

	protected void trabalhar() {
		System.out.println("Trabalhando como policial");
	}
	
	protected void levantar() {
		System.out.println("Levantando da cama as 06hr");
	}
}
