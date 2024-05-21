package modelos;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.AbstractConexion;
import conexion.ConexionMYSQL;
import conexion.app;

public class Estadistica extends AbstractConexion{

	private String temporada;
	private int jugador;
	private double Puntos_por_partido, Asistencias_por_partido, Tapones_por_partido,Rebotes_por_partido;
	
	public Estadistica(){
		
	}

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

	public void mostrarEstadiscticas() {	   
	            try {
	                System.out.println("Conectado correctamente a la base de datos\n");
	                Statement st = conn.createStatement();
	                String query = "SELECT * FROM ESTADISTICAS;";
	                ResultSet rs = st.executeQuery(query);

	                while(rs.next()) {
	                    System.out.println(rs.getString(1));
	                }

	            } catch (SQLException e) {
	                System.out.println("Ha habido algún problema en la conexión");
	                e.printStackTrace();
	            }
	    }

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public int getJugador() {
		return jugador;
	}

	public void setJugador(int jugador) {
		this.jugador = jugador;
	}

	public double getPuntos_por_partido() {
		return Puntos_por_partido;
	}

	public void setPuntos_por_partido(double puntos_por_partido) {
		Puntos_por_partido = puntos_por_partido;
	}

	public double getAsistencias_por_partido() {
		return Asistencias_por_partido;
	}

	public void setAsistencias_por_partido(double asistencias_por_partido) {
		Asistencias_por_partido = asistencias_por_partido;
	}

	public double getTapones_por_partido() {
		return Tapones_por_partido;
	}

	public void setTapones_por_partido(double tapones_por_partido) {
		Tapones_por_partido = tapones_por_partido;
	}

	public double getRebotes_por_partido() {
		return Rebotes_por_partido;
	}

	public void setRebotes_por_partido(double rebotes_por_partido) {
		Rebotes_por_partido = rebotes_por_partido;
	}

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
