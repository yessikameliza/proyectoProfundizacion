package com.proyectoProfundizacion.web.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.proyectoProfundizacion.web.app.entity.EncuestaUsuario;

public interface Encuesta_usuario_Repository extends CrudRepository<EncuestaUsuario, Long>{
	
	
	public Optional<EncuestaUsuario> findByCodigo(String codigo);

}