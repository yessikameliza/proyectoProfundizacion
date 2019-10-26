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
public interface Respuesta_UsuarioRepositorty extends CrudRepository<Respuesta_Usuario, Long>{
	
	
	public Optional<Respuesta_Usuario> findByCodigo(String codigo);

}
