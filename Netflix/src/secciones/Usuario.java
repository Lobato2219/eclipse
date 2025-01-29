package secciones;

import java.util.List;

public class Usuario {

	private String nombre;
	private String password;
	private String plan;
	private String fecha_alta;
	private String metodo_pago;
	private String direccion;
	private String pais;
	private String rol;

	public Usuario(String nombre, String password, String plan, String fecha_alta, String metodo_pago, String direccion,
			String pais, String rol) {
		this.nombre = nombre;
		this.password = password;
		this.plan = plan;
		this.fecha_alta = fecha_alta;
		this.metodo_pago = metodo_pago;
		this.direccion = direccion;
		this.pais = pais;
		this.rol = rol;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getFecha_alta() {
		return fecha_alta;
	}

	public void setFecha_alta(String fecha_alta) {
		this.fecha_alta = fecha_alta;
	}

	public String getMetodo_pago() {
		return metodo_pago;
	}

	public void setMetodo_pago(String metodo_pago) {
		this.metodo_pago = metodo_pago;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public List<Serie> consultarSeries() {
		return null;
	}

	public List<Peliculas> consultarPelis() {
		return null;
	}

	public List<Juego> consultarJuegos() {
		return null;
	}
}
