package org.cinespace.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_peliculas")
public class Pelicula {
	
	@Id
	@Column(name = "id_peli")
	private String codigo;
	
	@Column(name = "des_peli")
	private String descripcion;
	
	@Column(name = "asientos")
	private int asientos;
	
	@Column(name = "pre_peli")
	private double precio;
	
	private String categoria;
	
	private String estado;
	

	@Override
	public String toString() {
		return "Pelicula [codigo=" + codigo + ", descripcion=" + descripcion + ", asientos=" + asientos + ", precio="
				+ precio + ", categoria=" + categoria + ", estado=" + estado + "]";
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getAsientos() {
		return asientos;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
