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
 * The Class Partido.
 */
public class Partido extends AbstractConexion {

	/** The puntos visitante. */
	private int codigo, puntos_local, puntos_visitante;
	
	/** The temporada. */
	private String equipo_local, equipo_visitante, temporada;

	public Partido() {
	}

	public Partido(int codigo, int puntos_local, int puntos_visitante, String equipo_local, String equipo_visitante,
			String temporada) {
		super();
		this.codigo = codigo;
		this.puntos_local = puntos_local;
		this.puntos_visitante = puntos_visitante;
		this.equipo_local = equipo_local;
		this.equipo_visitante = equipo_visitante;
		this.temporada = temporada;
	}

	/**
	 * Gets the codigo.
	 *
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Sets the codigo.
	 *
	 * @param codigo the new codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Gets the puntos local.
	 *
	 * @return the puntos local
	 */
	public int getPuntos_local() {
		return puntos_local;
	}

	/**
	 * Sets the puntos local.
	 *
	 * @param puntos_local the new puntos local
	 */
	public void setPuntos_local(int puntos_local) {
		this.puntos_local = puntos_local;
	}

	/**
	 * Gets the puntos visitante.
	 *
	 * @return the puntos visitante
	 */
	public int getPuntos_visitante() {
		return puntos_visitante;
	}

	/**
	 * Sets the puntos visitante.
	 *
	 * @param puntos_visitante the new puntos visitante
	 */
	public void setPuntos_visitante(int puntos_visitante) {
		this.puntos_visitante = puntos_visitante;
	}

	/**
	 * Gets the equipo local.
	 *
	 * @return the equipo local
	 */
	public String getEquipo_local() {
		return equipo_local;
	}

	/**
	 * Sets the equipo local.
	 *
	 * @param equipo_local the new equipo local
	 */
	public void setEquipo_local(String equipo_local) {
		this.equipo_local = equipo_local;
	}

	/**
	 * Gets the equipo visitante.
	 *
	 * @return the equipo visitante
	 */
	public String getEquipo_visitante() {
		return equipo_visitante;
	}

	/**
	 * Sets the equipo visitante.
	 *
	 * @param equipo_visitante the new equipo visitante
	 */
	public void setEquipo_visitante(String equipo_visitante) {
		this.equipo_visitante = equipo_visitante;
	}

	/**
	 * Gets the temporada.
	 *
	 * @return the temporada
	 */
	public String getTemporada() {
		return temporada;
	}

	/**
	 * Sets the temporada.
	 *
	 * @param temporada the new temporada
	 */
	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	@Override
	public String toString() {
		return "ModeloPartido {\n" +
				"    codigo          = " + codigo + ",\n" +
				"    puntos_local    = " + puntos_local + ",\n" +
				"    puntos_visitante= " + puntos_visitante + ",\n" +
				"    equipo_local    = '" + equipo_local + "',\n" +
				"    equipo_visitante= '" + equipo_visitante + "',\n" +
				"    temporada       = '" + temporada + "'\n" +
				"}";
	}

}
