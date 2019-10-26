/**
 * 
 */
package com.proyectoProfundizacion.web.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.proyectoProfundizacion.web.app.entity.Encuesta;

/**
 * @author PERSONAL
 *
 */
public interface EncuestaRepository extends CrudRepository<Encuesta, Long>{
	
	
	public Optional<Encuesta> findByCodigo(String codigo);

}