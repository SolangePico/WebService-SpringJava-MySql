package com.altiorapicosolange.altiorapicosolange;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "article_order_detail")
@Table(name = "article_order_detail")
public class OrdenDetalle {

	@Id
	@Column(name = "ORD_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ord_id;

	@Column(name = "ORD_CODE")
	private String ord_code;

	@Column(name = "ORD_ART_CODE")
	private int ord_art_code;
	
	@ManyToOne
	private Orden orden;
	
	@ManyToMany
	private List<Articulo> articulo;

	public int getOrd_id() {
		return ord_id;
	}

	public void setOrd_id(int ord_id) {
		this.ord_id = ord_id;
	}

	public String getOrd_code() {
		return ord_code;
	}

	public void setOrd_code(String ord_code) {
		this.ord_code = ord_code;
	}

	public int getOrd_art_code() {
		return ord_art_code;
	}

	public void setOrd_art_code(int ord_art_code) {
		this.ord_art_code = ord_art_code;
	}
}
