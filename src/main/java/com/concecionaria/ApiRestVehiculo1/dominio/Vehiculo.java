package com.concecionaria.ApiRestVehiculo1.dominio;

import javax.persistence.*;

@Entity
public class Vehiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "marca")
    private  String marca;
    
    @Column(name = "color")
    private  String color; 
    
    @Column(name = "anio")
    private  Integer anio;
    
    
    @Column(name = "precio")
    private Integer precio;
    
    public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
///
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
////
    public String getMarca() {
        return marca;
    }

    public void setSurname(String marca) {
        this.marca = marca;
    }

	@Override
	public String toString() {
		return "Vehiculo [id=" + id + ","
				+ "\n modelo=" + modelo + ", "
			    + "\n marca=" + marca + ", "
				+ "\n color=" + color + ", "
				+ "\n anio=" + anio + ","
				+ "\n precio=" + precio + "]";
	}

}
