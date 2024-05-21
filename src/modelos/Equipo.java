/*@author
 * Gabriel Caja
 */
package modelos;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.AbstractConexion;
import conexion.ConexionMYSQL;
import conexion.app;

/**
 * The Class Equipo.
 */
public class Equipo extends AbstractConexion {

	/** The division. */
	private String nombre, ciudad, conferencia, division;

	public Equipo() {
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

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the ciudad.
	 *
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * Sets the ciudad.
	 *
	 * @param ciudad the new ciudad
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * Gets the conferencia.
	 *
	 * @return the conferencia
	 */
	public String getConferencia() {
		return conferencia;
	}

	/**
	 * Sets the conferencia.
	 *
	 * @param conferencia the new conferencia
	 */
	public void setConferencia(String conferencia) {
		this.conferencia = conferencia;
	}

	/**
	 * Gets the division.
	 *
	 * @return the division
	 */
	public String getDivision() {
		return division;
	}

	/**
	 * Sets the division.
	 *
	 * @param division the new division
	 */
	public void setDivision(String division) {
		this.division = division;
	}
}
