package com.altiorapicosolange.altiorapicosolange;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImp implements ClienteService{

	@Autowired
	private ClienteRepositorio repositorio;
	@Override
	public List<Cliente> listarClientes() {
		return repositorio.findAll();
	}

	@Override
	public Cliente listarIdCliente(int code) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente crearCliente(Cliente cli) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente editarCliente(Cliente cli) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente eliminarCliente(int code) {
		// TODO Auto-generated method stub
		return null;
	}

}
