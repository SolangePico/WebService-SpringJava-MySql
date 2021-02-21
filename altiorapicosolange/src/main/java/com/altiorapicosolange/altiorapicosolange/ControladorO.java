package com.altiorapicosolange.altiorapicosolange;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({ "/ordenes" })
public class ControladorO {

	@Autowired
	OrdenService serviceO;

	@Autowired
	OrdenDetalleService serviceOD;

	@GetMapping(path = { "/{code}" })
	public List<OrdenByCliente> listarOrden(@PathVariable("code") int code) {
		return serviceO.listarOrdenesCliente(code);
	}

	@PostMapping
	public void crearOrden(@RequestBody OrdenComplete ordD) {
		Orden ordenC = new Orden();
		ordenC.setNumeroOrden(ordD.getNumeroOrden());
		ordenC.setCodeClienteOrden(ordD.getCodeClienteOrden());
		ordenC.setFechaOrden(new Date(System.currentTimeMillis()));
		serviceO.crearOrden(ordenC);
		for (int i = 0; i < ordD.getDetalles().size(); i++) {
			OrdenDetalle ordenDetalle = new OrdenDetalle();
			ordenDetalle.setOrd_code(ordenC.getNumeroOrden());
			ordenDetalle.setOrd_art_code(ordD.getDetalles().get(i).getCodeArticulo());
			serviceOD.crearOrdenDetalle(ordenDetalle);
		}
		ordD.getDetalles();
	}
}
