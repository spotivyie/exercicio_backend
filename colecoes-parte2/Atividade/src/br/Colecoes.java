package br;

import br.PessoaGenero;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Colecoes {

    public static void main(String args[]) {
    	atividade();
    }

    private static void atividade() {
        Map<String, PessoaGenero> feminino = new TreeMap<String, PessoaGenero>();
        
        PessoaGenero c = new PessoaGenero("Lúcia Ferreira - F", "F");
        PessoaGenero d = new PessoaGenero("Ana Vieira - F", "F");
        
        feminino.put("4", c);
        feminino.put("5", d);
        
        Map<String, PessoaGenero> masculino = new TreeMap<String, PessoaGenero>();

        PessoaGenero a = new PessoaGenero("João da Silva - M", "M");
        PessoaGenero b = new PessoaGenero("Antonio Sousa - M", "M");
        PessoaGenero e = new PessoaGenero("Benedito Silva - M", "M");
        
        masculino.put("1", a);
        masculino.put("2", b);
        masculino.put("3", e);

        System.out.println("***** Feminino *****");
        feminino.values().stream().forEach(System.out::println);
        
        System.out.println("***** Masculino *****");
        masculino.values().stream().forEach(System.out::println);
    }
}