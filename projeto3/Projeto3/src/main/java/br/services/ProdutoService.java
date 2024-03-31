package main.java.br.services;

import main.java.br.dao.IProdutoDAO;
import main.java.br.domain.Produto;
import main.java.br.services.generics.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}