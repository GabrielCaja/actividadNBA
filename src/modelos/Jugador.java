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
 * The Class Jugador.
 */
public class Jugador extends AbstractConexion {

	/** The nombre equipo. */
	private String nombreJugador, procedencia, altura, posicion, nombreEquipo;
	
	/** The peso. */
	private int codigo, peso;

	public Jugador(int codigo, String nombreJugador, String procedencia, String altura, int peso, String posicion,
			String nombreEquipo) {
		super();
		this.nombreJugador = nombreJugador;
		this.procedencia = procedencia;
		this.altura = altura;
		this.posicion = posicion;
		this.nombreEquipo = nombreEquipo;
		this.codigo = codigo;
		this.peso = peso;
	}

	public Jugador() {
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombreJugador;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombreJugador the new nombre
	 */
	public void setNombre(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	/**
	 * Gets the procedencia.
	 *
	 * @return the procedencia
	 */
	public String getProcedencia() {
		return procedencia;
	}

	/**
	 * Sets the procedencia.
	 *
	 * @param procedencia the new procedencia
	 */
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	/**
	 * Gets the altura.
	 *
	 * @return the altura
	 */
	public String getAltura() {
		return altura;
	}

	/**
	 * Sets the altura.
	 *
	 * @param altura the new altura
	 */
	public void setAltura(String altura) {
		this.altura = altura;
	}

	/**
	 * Gets the posicion.
	 *
	 * @return the posicion
	 */
	public String getPosicion() {
		return posicion;
	}

	/**
	 * Sets the posicion.
	 *
	 * @param posicion the new posicion
	 */
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	/**
	 * Gets the nombre equipo.
	 *
	 * @return the nombre equipo
	 */
	public String getNombre_equipo() {
		return nombreEquipo;
	}

	/**
	 * Sets the nombre equipo.
	 *
	 * @param nombreEquipo the new nombre equipo
	 */
	public void setNombre_equipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
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
	 * Gets the peso.
	 *
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * Sets the peso.
	 *
	 * @param peso the new peso
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Jugador {\n" +
				"    nombre          = '" + nombreJugador + "',\n" +
				"    procedencia     = '" + procedencia + "',\n" +
				"    altura          = '" + altura + "',\n" +
				"    posicion        = '" + posicion + "',\n" +
				"    nombre_equipo   = '" + nombreEquipo + "',\n" +
				"    codigo          = " + codigo + ",\n" +
				"    peso            = " + peso + "\n" +
				"}";
	}

}
