/**
 * 
 */
package com.proyectoProfundizacion.web.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.proyectoProfundizacion.web.app.entity.UsuarioTemIntere;

/**
 * @author PERSONAL
 *
 */
public interface Usuario_Tem_interesRepository extends CrudRepository<UsuarioTemIntere, Long>{
	
	
	public Optional<UsuarioTemIntere> findByCodigo(String codigo);

}
