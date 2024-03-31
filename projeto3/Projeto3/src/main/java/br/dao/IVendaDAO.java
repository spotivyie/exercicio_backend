package main.java.br.dao;

import main.java.br.dao.generic.IGenericDAO;
import main.java.br.domain.Venda;
import main.java.br.exceptions.DAOException;
import main.java.br.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
