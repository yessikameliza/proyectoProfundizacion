package com.proyectoProfundizacion.web.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.proyectoProfundizacion.web.app.entity.Opcion;

public interface Opcion_Repository extends CrudRepository<Opcion, Long>{
	
	
	public Optional<Opcion> findByCodigo(String codigo);

}