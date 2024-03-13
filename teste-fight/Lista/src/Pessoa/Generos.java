package Pessoa;

import java.util.List;
import java.util.Objects;

import org.junit.Assert;
import org.junit.Test;

public class Generos {

	    private String nome;

	    private String genero;

	    public Generos() {

	    }

	    public Generos(String nome, String genero) {
	        this.nome = nome;
	        this.genero = genero;
	    }

	    public Generos(Generos generos) {
	        this(generos.getNome(), generos.getGenero());
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getGenero() {
	        return genero;
	    }

	    public void setGenero(String genero) {
	        this.genero = genero;
	    }

	    public List<Generos> populaPessoas() {
	    	Generos pessoa1 = new Generos("Alane", "Feminino");
	    	Generos pessoa2 = new Generos("Hernandez", "Masculino");
	    	Generos pessoa3 = new Generos("Mario","Masculino");
	    	Generos pessoa4 = new Generos("Maria", "Feminino");
	    	Generos pessoa5 = new Generos("Ana", "Feminino");
	        return List.of(pessoa1,pessoa2,pessoa3,pessoa4, pessoa5);
	    }

	    @Override
	    public String toString() {
	        return "Pessoa{" +
	                "nome='" + nome + '\'' +
	                ", genero='" + genero + 
	                '}';
	    }
	    
}