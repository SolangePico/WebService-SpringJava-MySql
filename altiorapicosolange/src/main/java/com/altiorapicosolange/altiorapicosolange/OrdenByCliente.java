package com.altiorapicosolange.altiorapicosolange;

import java.util.Date;

public class OrdenByCliente {

	private String numeroOrden;
	private String nombreCliente;
	private String barCodeArticulo;
	private String nombreArticulo;
	private Date fechaOrden;

	public OrdenByCliente(String numeroOrden, String nombreCliente, String barCodeArticulo, String nombreArticulo,
			Date fechaOrden) {
		this.numeroOrden = numeroOrden;
		this.nombreCliente = nombreCliente;
		this.barCodeArticulo = barCodeArticulo;
		this.nombreArticulo = nombreArticulo;
		this.fechaOrden = fechaOrden;
	}

	public String getNumeroOrden() {
		return numeroOrden;
	}

	public void setNumeroOrden(String numeroOrden) {
		this.numeroOrden = numeroOrden;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getBarCodeArticulo() {
		return barCodeArticulo;
	}

	public void setBarCodeArticulo(String barCodeArticulo) {
		this.barCodeArticulo = barCodeArticulo;
	}

	public String getNombreArticulo() {
		return nombreArticulo;
	}

	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}

	public Date getFechaOrden() {
		return fechaOrden;
	}

	public void setFechaOrden(Date fechaOrden) {
		this.fechaOrden = fechaOrden;
	}
}
