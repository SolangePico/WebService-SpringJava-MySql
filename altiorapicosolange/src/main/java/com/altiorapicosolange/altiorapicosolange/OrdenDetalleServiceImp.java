package com.altiorapicosolange.altiorapicosolange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdenDetalleServiceImp implements OrdenDetalleService {
	@Autowired
	private OrdenDetalleRepositorio repositorioOD;

	@Override
	public OrdenDetalle crearOrdenDetalle(OrdenDetalle ordDetalle) {
		return repositorioOD.save(ordDetalle);
	}
}
