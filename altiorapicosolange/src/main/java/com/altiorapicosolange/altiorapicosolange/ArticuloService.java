package com.altiorapicosolange.altiorapicosolange;

import java.util.List;

public interface ArticuloService {
	List<Articulo> listarArticulos();

	Articulo listarIdArticulo(int code);

	Articulo crearArticulo(Articulo art);

	Articulo editarArticulo(Articulo art);

	Articulo eliminarArticulo(int code);
}