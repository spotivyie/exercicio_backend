package fábrica;

public class CarFactory extends Factory{
	
	Car retrieveCar(String requestedGrade) {
		switch (requestedGrade) {
			case"A":
				return new Volkswagem(100, "cheio", "branco");
			case"B":
				return new Toyota(900, "cheio", "preto");
			default:
				System.out.println("asd");
				return null;
		}
	}
}
