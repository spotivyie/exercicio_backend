package lista;

import java.util.ArrayList;
import java.util.List;

public class Demo {
	//receber qualquer tipo de lista no carro 

	    public static void main(String args[]) {
	        List<ICarro> carros = new ArrayList<>();
	        carros.add(new Civic());
	        carros.add(new Honda());
	        carros.add(new Mercedes());
	        carros.add(new Toyota());
	        imprimirCarros(carros);
	    }

	    public static void imprimirCarros(List<? extends ICarro> lista) {
	        for (ICarro carros : lista) {
	            System.out.println(carros);
	        }
	    }
}
