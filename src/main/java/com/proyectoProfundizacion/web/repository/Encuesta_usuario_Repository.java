package com.proyectoProfundizacion.web.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface Encuesta_usuario_Repository extends CrudRepository<Encuesta_usuario, Long>{
	
	
	public Optional<Encuesta_usuario> findByCodigo(String codigo);

}