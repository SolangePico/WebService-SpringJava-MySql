package com.altiorapicosolange.altiorapicosolange;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenServiceImp implements OrdenService {
	
	@Autowired
	private OrdenRepositorio repositorioO;

	@Override
	public List<Orden> listarOrdenesCliente(int code) {
		return repositorioO.findById(code);
	}

	@Override
	public Orden crearOrden(Orden ord) {
		return repositorioO.save(ord);
	}
}
