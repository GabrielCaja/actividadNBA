package modelos;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.AbstractConexion;
import conexion.ConexionMYSQL;
import conexion.app;

public class Equipo extends AbstractConexion{

	private String nombre, ciudad, conferencia, division;
	
	public Equipo(){
		}

	public Equipo(String nombre, String ciudad, String conferencia, String division) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.conferencia = conferencia;
		this.division = division;
	}

	@Override
	public String toString() {
	    return "Equipo {\n" +
	           "    nombre       = '" + nombre + "',\n" +
	           "    ciudad       = '" + ciudad + "',\n" +
	           "    conferencia  = '" + conferencia + "',\n" +
	           "    division     = '" + division + "'\n" +
	           "}";
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getConferencia() {
		return conferencia;
	}

	public void setConferencia(String conferencia) {
		this.conferencia = conferencia;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}
}
