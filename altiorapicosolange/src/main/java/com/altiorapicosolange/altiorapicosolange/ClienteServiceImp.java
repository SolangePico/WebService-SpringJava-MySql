package com.altiorapicosolange.altiorapicosolange;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImp implements ClienteService {

	@Autowired
	private ClienteRepositorio repositorio;

	@Override
	public List<Cliente> listarClientes() {
		return repositorio.findAll();
	}

	@Override
	public Cliente listarIdCliente(int code) {
		return repositorio.findById(code);
	}

	@Override
	public Cliente crearCliente(Cliente cli) {
		return repositorio.save(cli);
	}

	@Override
	public Cliente editarCliente(Cliente cli) {
		return repositorio.save(cli);
	}

	@Override
	public Cliente eliminarCliente(int code) {
		Cliente cli = repositorio.findById(code);
		if (cli != null) {
			repositorio.delete(cli);
		}
		return cli;
	}
}
