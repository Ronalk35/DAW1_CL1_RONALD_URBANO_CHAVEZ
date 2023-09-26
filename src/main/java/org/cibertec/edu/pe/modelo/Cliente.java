package org.cibertec.edu.pe.modelo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	// Compos o Atributos
	@Id
	private int Id;
	private String Apellidos;
	private String Nombres;
	private String Correo;
	private Date Fechanacimiento;
	private String Dni;
	
	  @ManyToOne
	    @JoinColumn(name = "IdCategoria", referencedColumnName = "IdCategoria")
	    private Categoria categoria;

	public Cliente() {
		super();
	}

	public Cliente(int id, String apellidos, String nombres, String correo, Date fechanacimiento, String dni) {

		Id = id;
		Apellidos = apellidos;
		Nombres = nombres;
		Correo = correo;
		Fechanacimiento = fechanacimiento;
		Dni = dni;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public Date getFechanacimiento() {
		return Fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		Fechanacimiento = fechanacimiento;
	}

	public String getDni() {
		return Dni;
	}

	public void setDni(String dni) {
		Dni = dni;
	}

}
