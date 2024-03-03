package dao;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import domain.Cliente;

public class ClienteMapDAO implements IClienteDAO {

	private Map<Long, Cliente> map;
	
	public ClienteMapDAO() {
        map = new TreeMap<>();
    }
	
	public Boolean cadastrar(Cliente cliente) {
        if (map.containsKey(cliente.getCpf())) {
            return false;
        }
        
        map.put(cliente.getCpf(), cliente);
        return true;
    }

	public void excluir(Long cpf) {
		Cliente clienteCadastrado = map.get(cpf);
		map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
	}

	public void alterar(Cliente cliente) {
		Cliente clienteCadastrado = map.get(cliente.getCpf());
        clienteCadastrado.setNome(cliente.getNome());
        clienteCadastrado.setTel(cliente.getTel());
        clienteCadastrado.setNumero(cliente.getNumero());
        clienteCadastrado.setEnd(cliente.getEnd());
        clienteCadastrado.setCidade(cliente.getCidade());
        clienteCadastrado.setEstado(cliente.getEstado());
	}

	public Cliente consultar(Long cpf) {
		return this.map.get(cpf);
	}

	public Collection<Cliente> buscarTodos() {
		return this.map.values();
	}

}
