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
	public Articulo crearArticulo(Articulo cli) {
		return repositorioA.save(cli);
	}

	@Override
	public Articulo editarArticulo(Articulo cli) {
		return repositorioA.save(cli);
	}

	@Override
	public Articulo eliminarArticulo(int code) {
		Articulo cli = repositorioA.findById(code);
		if (cli != null) {
			repositorioA.delete(cli);
		}
		return cli;
	}
}
