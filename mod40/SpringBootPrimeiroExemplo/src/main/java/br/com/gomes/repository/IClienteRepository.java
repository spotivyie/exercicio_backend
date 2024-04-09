/**
 * 
 */
package br.com.gomes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.gomes.domain.Cliente;

/**
 * @author wendel.gomes
 *
 */
@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{

}
