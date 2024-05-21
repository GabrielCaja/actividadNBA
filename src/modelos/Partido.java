package modelos;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.AbstractConexion;
import conexion.ConexionMYSQL;
import conexion.app;

public class Partido extends AbstractConexion{
	
	private int codigo, puntos_local, puntos_visitante;
	private String equipo_local, equipo_visitante,temporada;
	
	public Partido(){}
	
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


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getPuntos_local() {
		return puntos_local;
	}

	public void setPuntos_local(int puntos_local) {
		this.puntos_local = puntos_local;
	}

	public int getPuntos_visitante() {
		return puntos_visitante;
	}

	public void setPuntos_visitante(int puntos_visitante) {
		this.puntos_visitante = puntos_visitante;
	}

	public String getEquipo_local() {
		return equipo_local;
	}

	public void setEquipo_local(String equipo_local) {
		this.equipo_local = equipo_local;
	}

	public String getEquipo_visitante() {
		return equipo_visitante;
	}

	public void setEquipo_visitante(String equipo_visitante) {
		this.equipo_visitante = equipo_visitante;
	}

	public String getTemporada() {
		return temporada;
	}

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
