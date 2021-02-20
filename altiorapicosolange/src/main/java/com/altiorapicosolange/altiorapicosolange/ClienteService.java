package com.altiorapicosolange.altiorapicosolange;

import java.util.List;

public interface ClienteService {
	List<Cliente> listarClientes();

	Cliente listarIdCliente(int code);

	Cliente crearCliente(Cliente cli);

	Cliente editarCliente(Cliente cli);

	Cliente eliminarCliente(int code);
	
	Cliente buscarCodigoCliente(String id);
}