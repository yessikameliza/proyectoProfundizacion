/**
 * 
 */
package com.proyectoProfundizacion.web.app.Service;

import com.proyectoProfundizacion.web.app.entity.Pregunta;

/**
 * @author PERSONAL
 *
 */
public interface UsuarioService {
public Iterable<Pregunta> getAllUsers();
	
	public Pregunta createAsignatura(Pregunta asig) throws Exception;
	
	public Pregunta getAsignaturaById(Long id) throws Exception;

	public Pregunta updateAsignatura(Pregunta asig) throws Exception;
		
	public void deleteAsignatura(Long id) throws Exception;
}
