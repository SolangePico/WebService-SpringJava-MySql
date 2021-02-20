package com.altiorapicosolange.altiorapicosolange;

import org.springframework.data.repository.Repository;

public interface OrdenDetalleRepositorio extends Repository<OrdenDetalle, Integer> {
	OrdenDetalle save(OrdenDetalle ordDetalle);
}
