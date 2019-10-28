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
/**
public interface tema_interes_Repository extends CrudRepository<tema_interes, Long>{
=======
public interface Tema_interes_Repository extends CrudRepository<TemaIntere, Long>{
>>>>>>> df0b5f0faf14f8a6e1cdd0659ba86dbfab3b348f
	
	
	public Optional<TemaIntere> findByCodigo(String codigo);

}*/
