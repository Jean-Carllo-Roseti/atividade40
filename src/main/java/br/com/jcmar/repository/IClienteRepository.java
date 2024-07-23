/**
 * 
 */
package br.com.jcmar.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.jcmar.domain.Cliente;


@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{

}
