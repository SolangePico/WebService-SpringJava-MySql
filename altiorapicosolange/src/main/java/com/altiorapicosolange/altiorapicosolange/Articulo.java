package com.altiorapicosolange.altiorapicosolange;

import java.util.List;

import javax.persistence.*;

@Entity(name = "article")
@Table(name = "article")
public class Articulo {

	@Id
	@Column(name = "AR_CODE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codeArticulo;

	@Column(name = "AR_BAR_CODE")
	private String barCodeArticulo;

	@Column(name = "AR_NAME")
	private String nombreArticulo;

	@Column(name = "AR_UNIT_PRICE")
	private Double precioUnitarioArticulo;
	
	@ManyToMany(mappedBy = "articulo")
	private List<OrdenDetalle> ordenDetalle;
	

	public int getCodeArticulo() {
		return codeArticulo;
	}

	public void setCodeArticulo(int codeArticulo) {
		this.codeArticulo = codeArticulo;
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

	public Double getPrecioUnitarioArticulo() {
		return precioUnitarioArticulo;
	}

	public void setPrecioUnitarioArticulo(Double precioUnitarioArticulo) {
		this.precioUnitarioArticulo = precioUnitarioArticulo;
	}
}