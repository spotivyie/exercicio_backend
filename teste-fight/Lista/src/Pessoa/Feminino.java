package Pessoa;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;

public class Feminino {
	
	@Test
	public static void main(String[] args) {
        List<Generos> lista = new Generos().populaPessoas();

        System.out.println("** Gênero Feminino **");
        lista.stream()
                .filter(pessoa -> pessoa.getGenero().equals("Feminino"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        
        Assert.assertEquals("Feminino", pessoa.getGenero());
	}
}