package main.java.br.services;

import main.java.br.domain.Cliente;
import main.java.br.exceptions.DAOException;
import main.java.br.services.generics.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

//	Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;
//
	Cliente buscarPorCPF(Long cpf) throws DAOException;
//
//	void excluir(Long cpf);
//
//	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}