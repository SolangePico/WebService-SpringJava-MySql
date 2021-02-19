package com.altiorapicosolange.altiorapicosolange;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({ "/articulos" })
public class ControladorA {

	@Autowired
	ArticuloService serviceA;

	@GetMapping
	public List<Articulo> listarArticulo() {
		return serviceA.listarArticulos();
	}

	@PostMapping
	public Articulo crearCliente(@RequestBody Articulo art) {
		return serviceA.crearArticulo(art);
	}

	@GetMapping(path = { "/{code}" })
	public Articulo listarIdArticulo(@PathVariable("code") int code) {
		return serviceA.listarIdArticulo(code);
	}

	@PutMapping(path = { "/{code}" })
	public Articulo editarArticulo(@RequestBody Articulo art, @PathVariable("code") int code) {
		art.setCodeArticulo(code);
		return serviceA.editarArticulo(art);
	}

	@DeleteMapping(path = { "/{code}" })
	public Articulo eliminarArticulo(@PathVariable("code") int code) {
		return serviceA.eliminarArticulo(code);
	}
}