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
 * The Class Estadistica.
 */
public class Estadistica extends AbstractConexion {

	/** The temporada. */
	private String temporada;
	
	/** The jugador. */
	private int jugador;
	
	/** The Rebotes por partido. */
	private double Puntos_por_partido, Asistencias_por_partido, Tapones_por_partido, Rebotes_por_partido;

	/**
	 * Instantiates a new estadistica.
	 */
	public Estadistica() {

	}

	/**
	 * Instantiates a new estadistica.
	 *
	 * @param temporada the temporada
	 * @param jugador the jugador
	 * @param puntos_por_partido the puntos por partido
	 * @param asistencias_por_partido the asistencias por partido
	 * @param tapones_por_partido the tapones por partido
	 * @param rebotes_por_partido the rebotes por partido
	 */
	public Estadistica(String temporada, int jugador, double puntos_por_partido, double asistencias_por_partido,
			double tapones_por_partido, double rebotes_por_partido) {
		super();
		this.temporada = temporada;
		this.jugador = jugador;
		Puntos_por_partido = puntos_por_partido;
		Asistencias_por_partido = asistencias_por_partido;
		Tapones_por_partido = tapones_por_partido;
		Rebotes_por_partido = rebotes_por_partido;
	}

	/**
	 * Mostrar estadiscticas.
	 */
	public void mostrarEstadiscticas() {
		try {
			System.out.println("Conectado correctamente a la base de datos\n");
			Statement st = conn.createStatement();
			String query = "SELECT * FROM ESTADISTICAS;";
			ResultSet rs = st.executeQuery(query);

			while (rs.next()) {
				System.out.println(rs.getString(1));
			}

		} catch (SQLException e) {
			System.out.println("Ha habido algún problema en la conexión");
			e.printStackTrace();
		}
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

	/**
	 * Gets the jugador.
	 *
	 * @return the jugador
	 */
	public int getJugador() {
		return jugador;
	}

	/**
	 * Sets the jugador.
	 *
	 * @param jugador the new jugador
	 */
	public void setJugador(int jugador) {
		this.jugador = jugador;
	}

	/**
	 * Gets the puntos por partido.
	 *
	 * @return the puntos por partido
	 */
	public double getPuntos_por_partido() {
		return Puntos_por_partido;
	}

	/**
	 * Sets the puntos por partido.
	 *
	 * @param puntos_por_partido the new puntos por partido
	 */
	public void setPuntos_por_partido(double puntos_por_partido) {
		Puntos_por_partido = puntos_por_partido;
	}

	/**
	 * Gets the asistencias por partido.
	 *
	 * @return the asistencias por partido
	 */
	public double getAsistencias_por_partido() {
		return Asistencias_por_partido;
	}

	/**
	 * Sets the asistencias por partido.
	 *
	 * @param asistencias_por_partido the new asistencias por partido
	 */
	public void setAsistencias_por_partido(double asistencias_por_partido) {
		Asistencias_por_partido = asistencias_por_partido;
	}

	/**
	 * Gets the tapones por partido.
	 *
	 * @return the tapones por partido
	 */
	public double getTapones_por_partido() {
		return Tapones_por_partido;
	}

	/**
	 * Sets the tapones por partido.
	 *
	 * @param tapones_por_partido the new tapones por partido
	 */
	public void setTapones_por_partido(double tapones_por_partido) {
		Tapones_por_partido = tapones_por_partido;
	}

	/**
	 * Gets the rebotes por partido.
	 *
	 * @return the rebotes por partido
	 */
	public double getRebotes_por_partido() {
		return Rebotes_por_partido;
	}

	/**
	 * Sets the rebotes por partido.
	 *
	 * @param rebotes_por_partido the new rebotes por partido
	 */
	public void setRebotes_por_partido(double rebotes_por_partido) {
		Rebotes_por_partido = rebotes_por_partido;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "ModeloEstadisticas {\n" +
				"    temporada              = '" + temporada + "',\n" +
				"    jugador                = " + jugador + ",\n" +
				"    Puntos_por_partido     = " + Puntos_por_partido + ",\n" +
				"    Asistencias_por_partido= " + Asistencias_por_partido + ",\n" +
				"    Tapones_por_partido    = " + Tapones_por_partido + ",\n" +
				"    Rebotes_por_partido    = " + Rebotes_por_partido + "\n" +
				"}";
	}

}
