package com.proyectoProfundizacion.web.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.proyectoProfundizacion.web.app.entity.RangoEdadobjetivo;

public interface RangoEdadobjetivoRepository extends CrudRepository<RangoEdadobjetivo, Long>{
	
	
	public Optional<RangoEdadobjetivo> findByCodigo(String codigo);

}
