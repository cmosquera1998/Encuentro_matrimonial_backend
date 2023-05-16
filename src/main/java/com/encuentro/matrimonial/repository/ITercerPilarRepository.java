package com.encuentro.matrimonial.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.encuentro.matrimonial.modelo.TercerPilar;

public interface ITercerPilarRepository extends CrudRepository<TercerPilar, Long> {

	@Query("Select t FROM tercer_pilar t WHERE t.id = :id")
	TercerPilar findByTercerPilar(@Param("id") Long id);
	
	@Query(value = "SELECT t FROM tercer_pilar t WHERE t.ciudad.pais.id = :idPais")
	List<TercerPilar> obtenerPilarPorPais(Long idPais);

	@Query(value = "SELECT t FROM tercer_pilar t WHERE t.ciudad.id = :idCiudad")
	List<TercerPilar> obtenerPilarPorCiudad(Long idCiudad);
	
	@Query(value = "SELECT t FROM tercer_pilar t WHERE t.ciudad.region.id = :idRegion")
	List<TercerPilar> obtenerPilarPorRegionPais(Long idRegion);

	@Query(value = "SELECT t FROM tercer_pilar t WHERE t.ciudad.pais.zona.id = :idZona")
	List<TercerPilar> obtenerPilarPorZona(Long idZona);

}
