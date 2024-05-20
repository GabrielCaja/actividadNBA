package modelos;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.AbstractConexion;
import conexion.ConexionMYSQL;
import conexion.Conexiones;

public class Jugador extends AbstractConexion{
	
	private String nombreJugador,procedencia,altura,posicion,nombreEquipo;
	private int codigo,peso;
	
	public Jugador(int codigo,String nombreJugador,String procedencia,String altura,int peso,String posicion,String nombreEquipo) {
		super();
		this.nombreJugador = nombreJugador;
		this.procedencia = procedencia;
		this.altura = altura;
		this.posicion = posicion;
		this.nombreEquipo = nombreEquipo;
		this.codigo = codigo;
		this.peso = peso;
	}

	public Jugador() {}

	public String getNombre() {
		return nombreJugador;
	}

	public void setNombre(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public String getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getNombre_equipo() {
		return nombreEquipo;
	}

	public void setNombre_equipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombreJugador + ", procedencia=" + procedencia + ", altura=" + altura + ", posicion="
				+ posicion + ", nombre_equipo=" + nombreEquipo + ", codigo=" + codigo + ", peso=" + peso + "]";
	}


}
