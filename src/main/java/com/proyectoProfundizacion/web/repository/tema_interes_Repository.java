/**
 * 
 */
package com.proyectoProfundizacion.web.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

/**
 * @author PERSONAL
 *
 */
public interface tema_interes_Repository extends CrudRepository<tema_interes, Long>{
	
	
	public Optional<tema_interes> findByCodigo(String codigo);

}
