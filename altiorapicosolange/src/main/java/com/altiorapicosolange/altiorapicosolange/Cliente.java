package com.altiorapicosolange.altiorapicosolange;

import javax.persistence.*;

@Entity
@Table(name="client")
public class Cliente {

	@Id
	@Column(name="CLI_CODE")
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int codeCliente;
	
	@Column(name="CLI_ID")
	private String idCliente;
	
	@Column(name="CLI_NAME")
	private String nombreCliente;
	
	@Column(name="CLI_LAST_NAME")
	private String apellidoCliente;

	public int getCodeCliente() {
		return codeCliente;
	}

	public void setCodeCliente(int codeCliente) {
		this.codeCliente = codeCliente;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}
}
