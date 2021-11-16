package org.cinespace.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_usuarios")
public class Usuario {
	
	@Id
	@Column(name = "cod_usua")
	private int cod_usu;
	
	@Column(name = "nom_usua")
	private String nombre;
	
	@Column(name = "ape_usua")
	private String apellido;
	
	@Column(name = "usr_usua")
	private String usuario;
	
	@Column(name = "cla_usua")
	private String clave;

	@Override
	public String toString() {
		return "Usuario [cod_usu=" + cod_usu + ", nombre=" + nombre + ", apellido=" + apellido + ", usuario=" + usuario
				+ ", clave=" + clave + "]";
	}

	public int getCod_usu() {
		return cod_usu;
	}

	public void setCod_usu(int cod_usu) {
		this.cod_usu = cod_usu;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
}
