package br.com.dao;

import java.util.List;

import br.com.domain.Produto;

public interface IProdutoDAO {

	public Produto cadastrar(Produto produto);

	public void excluir(Produto produto);

	public List<Produto> buscarTodos();
}
