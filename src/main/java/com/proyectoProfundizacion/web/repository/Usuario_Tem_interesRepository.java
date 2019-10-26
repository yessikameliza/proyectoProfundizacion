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
public interface Usuario_Tem_interesRepository extends CrudRepository<Usuario_Tem_interes, Long>{
	
	
	public Optional<Usuario_Tem_interes> findByCodigo(String codigo);

}
