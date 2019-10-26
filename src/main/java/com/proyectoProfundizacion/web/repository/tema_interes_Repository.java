/**
 * 
 */
package com.proyectoProfundizacion.web.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.proyectoProfundizacion.web.app.entity.TemaIntere;

/**
 * @author PERSONAL
 *
 */
public interface Tema_interes_Repository extends CrudRepository<TemaIntere, Long>{
	
	
	public Optional<TemaIntere> findByCodigo(String codigo);

}
