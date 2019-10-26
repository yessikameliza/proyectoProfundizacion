/**
 * 
 */
package com.proyectoProfundizacion.web.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.proyectoProfundizacion.web.app.entity.RespuestaUsuario;

/**
 * @author PERSONAL
 *
 */
public interface Respuesta_UsuarioRepositorty extends CrudRepository<RespuestaUsuario, Long>{
	
	
	public Optional<RespuestaUsuario> findByCodigo(String codigo);

}
