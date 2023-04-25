package com.encuentro.matrimonial.service;

import java.util.List;

import com.encuentro.matrimonial.modelo.CuartoPilar;

public interface ICuartoPilarService {

	void create(CuartoPilar pilar);

	List<CuartoPilar> getAll();

	CuartoPilar findByCuartoPilar(Long id);

	List<CuartoPilar> findByFiltroCuartoPilar(String fecha);

	CuartoPilar update(CuartoPilar pilar);

	void delete(Long id);

}
