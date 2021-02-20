package com.altiorapicosolange.altiorapicosolange;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface ArticuloRepositorio extends Repository<Articulo, Integer> {

	List<Articulo> findAll();

	Articulo findById(int code);

	Articulo save(Articulo art);

	void delete(Articulo art);

	Articulo findByBarCodeArticulo(String barCode);
}