package br;

import java.util.Objects;

public class PessoaGenero implements Comparable<PessoaGenero> {
	private String nome;
    private String genero;

    public PessoaGenero(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
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

    public String toString() {
        return this.nome;
    }
}