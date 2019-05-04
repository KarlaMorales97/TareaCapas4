package com.uca.capas.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class Producto {

	@Size(message="La longitud debe ser menor de 30 caracteres",max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String nombre;
	
	@Size(message="La longitud debe ser menor de 30 caracteres",max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String marca;
	
	@Size(message="La longitud debe ser menor de 30 caracteres",max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String descripcion;
	
	@Size(message="La longitud debe ser menor de 30 caracteres",max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String categoria;
	
	@NotNull(message="Este campo no puede estar vacio")
	@Min(value = 0, message="El precio no puede ser negativo")
	private Double precio;
	
	@NotEmpty(message="Este campo no puede estar vacio")
	@Pattern(regexp = "^([0-2][0-9]|3[0-1])(\\/)(0[1-9]|1[0-2])\\2(\\d{4})$", message="El formato de la fecha debe ser dd/MM/yyyy")
	private String vencimiento;
	
	public Producto() {
		
	}

	
	public Producto(
			@Size(message = "La longitud debe ser menor de 30 caracteres", max = 10) @NotEmpty(message = "Este campo no puede estar vacio") String nombre,
			@Size(message = "La longitud debe ser menor de 30 caracteres", max = 10) @NotEmpty(message = "Este campo no puede estar vacio") String marca,
			@Size(message = "La longitud debe ser menor de 30 caracteres", max = 10) @NotEmpty(message = "Este campo no puede estar vacio") String descripcion,
			@Size(message = "La longitud debe ser menor de 30 caracteres", max = 10) @NotEmpty(message = "Este campo no puede estar vacio") String categoria,
			@Min(value = 0, message = "El precio no puede ser negativo") @NotEmpty(message = "Este campo no puede estar vacio") Double precio,
			@NotEmpty(message = "Este campo no puede estar vacio") String vencimiento) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.precio = precio;
		this.vencimiento = vencimiento;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}
	
	
}
