package fábrica;

public class CompanyCarFactory extends Factory{
	
	Car retrieveCar(String requestedGrade) {
		switch(requestedGrade) {
			case"A":
				return new Tesla(1000, "cheio", "azul");
			case"B":
				return new Audi(800, "cheio", "vermelho");
			default:
				System.out.println("asd");
				return null;
		}
	}
}
