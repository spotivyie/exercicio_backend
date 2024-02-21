package parte;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Atividade {

    public static void main(String args[]) {
    	atividadeNome();
    }

    private static void atividadeNome() {
        System.out.println("Ordem Alfabética");
        List<Pessoa> lista = new ArrayList<Pessoa>();

        Pessoa a = new Pessoa("João");
        Pessoa b = new Pessoa("Ana");
        Pessoa c = new Pessoa("Denise");
        lista.add(a);
        lista.add(b);
        lista.add(c);
        Collections.sort(lista);
        System.out.println("Lista de nomes" + lista);
    }
}