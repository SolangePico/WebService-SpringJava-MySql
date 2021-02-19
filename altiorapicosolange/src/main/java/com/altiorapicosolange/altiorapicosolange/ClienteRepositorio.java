package com.altiorapicosolange.altiorapicosolange;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface ClienteRepositorio extends Repository<Cliente, Integer> {
	List<Cliente> findAll();

	Cliente findById(int code);

	Cliente save(Cliente cli);

	void delete(Cliente cli);
}