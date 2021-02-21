package com.altiorapicosolange.altiorapicosolange;

import java.util.List;

public interface OrdenService {
	List<OrdenByCliente> listarOrdenesCliente(int code);

	Orden crearOrden(Orden ord);
}
