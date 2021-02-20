package com.altiorapicosolange.altiorapicosolange;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface OrdenRepositorio extends Repository<Orden, Integer> {
	List<Orden> findById(int code);

	Orden save(Orden ord);
}
