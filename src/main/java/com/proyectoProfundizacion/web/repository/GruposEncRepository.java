/**
 * 
 */
package com.proyectoProfundizacion.web.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.proyectoProfundizacion.web.app.entity.Gruposenc;


/**
 * @author PERSONAL
 *
 */
public interface GruposEncRepository extends CrudRepository<Gruposenc, Long>{
	
	
	public Optional<Gruposenc> findByCodigo(String codigo);

}