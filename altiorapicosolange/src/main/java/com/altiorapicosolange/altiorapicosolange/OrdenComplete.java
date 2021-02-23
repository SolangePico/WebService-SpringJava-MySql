package com.altiorapicosolange.altiorapicosolange;

import java.util.List;
public class OrdenComplete {

	private String numeroOrden;
	private int codeClienteOrden;
	private List<Articulo> detalles;
	
	public String getNumeroOrden() {
		return numeroOrden;
	}
	public void setNumeroOrden(String numeroOrden) {
		this.numeroOrden = numeroOrden;
	}
	public int getCodeClienteOrden() {
		return codeClienteOrden;
	}
	public void setCodeClienteOrden(int codeClienteOrden) {
		this.codeClienteOrden = codeClienteOrden;
	}
	public List<Articulo> getDetalles() {
		return detalles;
	}
	public void setDetalles(List<Articulo> detalles) {
		this.detalles = detalles;
	}
}
