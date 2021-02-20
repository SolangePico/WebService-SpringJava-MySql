package com.altiorapicosolange.altiorapicosolange;

import java.util.List;

public interface OrdenService {
	List<Orden> listarOrdenesCliente(int code);

	Orden crearOrden(Orden ord);
}
