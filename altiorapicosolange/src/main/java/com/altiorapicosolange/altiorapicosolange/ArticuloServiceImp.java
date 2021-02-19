package com.altiorapicosolange.altiorapicosolange;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuloServiceImp implements ArticuloService{

	@Autowired
	private ArticuloRepositorio repositorioA;

	@Override
	public List<Articulo> listarArticulos() {
		return repositorioA.findAll();
	}

	@Override
	public Articulo listarIdArticulo(int code) {
		return repositorioA.findById(code);
	}

	@Override
	public Articulo crearArticulo(Articulo art) {
		return repositorioA.save(art);
	}

	@Override
	public Articulo editarArticulo(Articulo art) {
		return repositorioA.save(art);
	}

	@Override
	public Articulo eliminarArticulo(int code) {
		Articulo art = repositorioA.findById(code);
		if (art != null) {
			repositorioA.delete(art);
		}
		return art;
	}
}
