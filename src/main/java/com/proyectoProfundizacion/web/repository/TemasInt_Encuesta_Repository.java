/**
 * 
 */
package com.proyectoProfundizacion.web.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.proyectoProfundizacion.web.app.entity.TemasintEncuesta;

/**
 * @author PERSONAL
 *
 */
public interface TemasInt_Encuesta_Repository extends CrudRepository<TemasintEncuesta, Long>{
	
	
	public Optional<TemasintEncuesta> findByCodigo(String codigo);

}
