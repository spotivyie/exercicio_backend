package dao;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import domain.Cliente;

public class ClienteSetDAO implements IClienteDAO{
	
	private Set<Cliente> set;
	
	public ClienteSetDAO() {
		this.set = new HashSet<>();
	}
	
	public Boolean cadastrar(Cliente cliente) {
		return this.set.add(cliente);
	}
	
	public void excluir(Long cpf) {
		Cliente clienteEncontrato = null;
		for (Cliente cliente : this.set) {
			if (cliente.getCpf().equals(cpf)) {
				clienteEncontrato = cliente;
				break;
			}
		}
		
		if (clienteEncontrato != null) {
			this.set.remove(clienteEncontrato);
		}
	}
	
	public void alterar(Cliente cliente) {
		if (this.set.contains(cliente)) {
			for (Cliente clienteCadastrado : this.set) {
				if (clienteCadastrado.equals(cliente)) {
					clienteCadastrado.setNome(cliente.getNome());
					clienteCadastrado.setTel(cliente.getTel());
					clienteCadastrado.setNumero(cliente.getNumero());
					clienteCadastrado.setEnd(cliente.getEnd());
					clienteCadastrado.setCidade(cliente.getCidade());
					clienteCadastrado.setEstado(cliente.getEstado());
					break;
				}
			}
		}
	}
	
	public Cliente consultar(Long cpf) {
		for (Cliente clienteCadastrado : this.set) {
			if (clienteCadastrado.getCpf().equals(cpf)) {
				return clienteCadastrado;
			}
		}
		return null;
	}
	
	public Collection<Cliente> buscarTodos() {
		return this.set;
	}
}
