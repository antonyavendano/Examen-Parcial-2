package carros.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Información del Carro")
@Entity
@Table(name = "carro")
public class Carro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id_carro;

	@ApiModelProperty(notes = "Nombre de carro debe tener al menos 5")
	@Size(min = 5, max = 50, message = "nombres minimo 5 caracteres")
	@Column(name = "descripcion", nullable = false, length = 50)
	String descripcion;
	
	@ApiModelProperty(notes = "Modelo")
	@Column(name = "modelo", nullable = false)
	String modelo;
	
	@ApiModelProperty(notes = "Tamaño del Motor")
	@Column(name = "motor", nullable = false)
	String motor;
	
	@ApiModelProperty(notes = "Color")
	@Column(name = "color", nullable = false, length = 25)
	String color;
	
	@ApiModelProperty(notes = "Marca")
	@Column(name = "marca", nullable = false, length = 25)
	String marca;
	
	@ApiModelProperty(notes = "El precio con 2 decimales")
	@Digits(integer=10, fraction=2)
	@Column(name = "precio", nullable = false)
	Float precio;

	public Integer getId() {
		return id_carro;
	}

	public void setId(Integer id_carro) {
		this.id_carro = id_carro;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

}