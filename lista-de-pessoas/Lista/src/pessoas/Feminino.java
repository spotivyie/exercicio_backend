package pessoas;

import java.util.List;
import java.util.stream.Collectors;

public class Feminino {
	
	public static void main(String[] args) {
        List<Generos> lista = new Generos().populaPessoas();

        System.out.println("** Gênero Feminino **");
        lista.stream()
                .filter(pessoa -> pessoa.getGenero().equals("Feminino"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
	}
}
