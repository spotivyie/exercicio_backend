package br.com.dao;

import java.util.List;

import br.com.domain.Curso;

public interface ICursoDao {

	public Curso cadastrar(Curso curso);

	public void excluir(Curso cur);

	public List<Curso> buscarTodos();
}
