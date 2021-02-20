package com.altiorapicosolange.altiorapicosolange;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "article_order")
public class Orden {
	
	@Id
	@Column(name = "OR_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codeOrden;

	@Column(name = "OR_CODE")
	private String numeroOrden;

	@Column(name = "OR_CLI_CODE")
	private int codeClienteOrden;

	@Column(name = "OR_DATE")
	private Date fechaOrden;

	public int getCodeOrden() {
		return codeOrden;
	}

	public void setCodeOrden(int codeOrden) {
		this.codeOrden = codeOrden;
	}

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

	public Date getFechaOrden() {
		return fechaOrden;
	}

	public void setFechaOrden(Date fechaOrden) {
		this.fechaOrden = fechaOrden;
	}
}