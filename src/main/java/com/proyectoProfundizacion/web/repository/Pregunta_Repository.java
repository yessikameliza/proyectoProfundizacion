package com.proyectoProfundizacion.web.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.proyectoProfundizacion.web.app.entity.Pregunta;

public interface Pregunta_Repository extends CrudRepository<Pregunta, Long>{
	
	
	public Optional<Pregunta> findByCodigo(String codigo);

}
