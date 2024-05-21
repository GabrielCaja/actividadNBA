package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexion.AbstractConexion;
import interfaces.EstadisticaDAO;
import modelos.Estadistica;
import modelos.Jugador;

public class EstadisticasDAOImple extends AbstractConexion implements EstadisticaDAO{
	private double media;
	private List<Estadistica> statsJugador = new ArrayList <>();
	private List<Estadistica> statsJugadorC = new ArrayList <>();
	private List<Estadistica> statsEquipo = new ArrayList <>();
	@Override
	public List<Estadistica> findById(int codigo) {
		try {
			quitarRestricciones();
			query = "SELECT * FROM estadisticas WHERE jugador = ?";
			
			pst = conn.prepareStatement(query);
			
			pst.setInt(1, codigo);
			rs = pst.executeQuery();

			while (rs.next()) {
				String temporada = rs.getString(1);
				int jugador = rs.getInt(2);
				double puntos_por_partido = rs.getDouble(3);
				double asistencias_por_partido = rs.getDouble(4);
				double tapones_por_partido = rs.getDouble(5);
				double rebotes_por_partido = rs.getDouble(6);

				Estadistica estadisticasJ = new Estadistica(temporada, jugador, puntos_por_partido, asistencias_por_partido,
	        			tapones_por_partido, rebotes_por_partido);
				statsJugador.add(estadisticasJ);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return statsJugador;
	}

	@Override
	public List<Estadistica> findByCountry(String country) {
		try {
			quitarRestricciones();
			query = "SELECT temporada, jugador, puntos_por_partido, asistencias_por_partido, tapones_por_partido, rebotes_por_partido FROM jugadores INNER JOIN estadisticas ON jugadores.codigo = estadisticas.jugador WHERE Procedencia = ?;";
			
			pst = conn.prepareStatement(query);
			
			pst.setString(1, country);
			rs = pst.executeQuery();

			while (rs.next()) {
				String temporada = rs.getString(1);
				int jugador = rs.getInt(2);
				double puntos_por_partido = rs.getDouble(3);
				double asistencias_por_partido = rs.getDouble(4);
				double tapones_por_partido = rs.getDouble(5);
				double rebotes_por_partido = rs.getDouble(6);

				Estadistica estadisticasC = new Estadistica(temporada, jugador, puntos_por_partido, asistencias_por_partido,
	        			tapones_por_partido, rebotes_por_partido);
				statsJugadorC.add(estadisticasC);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		};
		return statsJugadorC;
	}

	@Override
	public List<Estadistica> findByEquipo(String nombre) {
		try {
			quitarRestricciones();
			query = "SELECT \r\n"
					+ "    jugador,est.temporada,\r\n"
					+ "est.Puntos_por_partido,est.Asistencias_por_partido,est.Tapones_por_partido,est.Rebotes_por_partido FROM \r\n"
					+ "    equipos e\r\n"
					+ "JOIN \r\n"
					+ "    jugadores j ON e.Nombre = j.Nombre_equipo\r\n"
					+ "JOIN \r\n"
					+ "    estadisticas est ON j.codigo = est.jugador\r\n"
					+ "WHERE \r\n"
					+ "    e.Nombre = ?;";
			
			pst = conn.prepareStatement(query);
			
			pst.setString(1, nombre);
			rs = pst.executeQuery();

			while (rs.next()) {
				int jugador = rs.getInt(1);
				String temporada = rs.getString(2);
				double puntos_por_partido = rs.getDouble(3);
				double asistencias_por_partido = rs.getDouble(4);
				double tapones_por_partido = rs.getDouble(5);
				double rebotes_por_partido = rs.getDouble(6);

				Estadistica estadisticasE = new Estadistica(temporada, jugador, puntos_por_partido, asistencias_por_partido,
	        			tapones_por_partido, rebotes_por_partido);
				statsEquipo.add(estadisticasE);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		};
		return statsEquipo;
	}

	@Override
	public double mediaPuntosPartido(Jugador jugador) {
	    media = 0;
	    String query = "SELECT AVG(puntos_por_partido) FROM estadisticas WHERE jugador = ?";
	    PreparedStatement pst = null;
	    ResultSet rs = null;
	    try {
	        pst = conn.prepareStatement(query);
	        pst.setInt(1, jugador.getCodigo());  
	        rs = pst.executeQuery();

	        if (rs.next()) {
	            media = rs.getDouble("AVG(puntos_por_partido)");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (rs != null) rs.close();
	            if (pst != null) pst.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    return media;
	}
	@Override
	public double mediaAsistencias(Jugador jugador) {
	    media = 0;

		  String query = "SELECT AVG(asistencias_por_partido) FROM estadisticas WHERE jugador = ?";
		    PreparedStatement pst = null;
		    ResultSet rs = null;
		    try {
		        pst = conn.prepareStatement(query);
		        pst.setInt(1, jugador.getCodigo());  
		        rs = pst.executeQuery();

		        if (rs.next()) {
		            media = rs.getDouble("AVG(asistencias_por_partido)");
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    } finally {
		        try {
		            if (rs != null) rs.close();
		            if (pst != null) pst.close();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }
		
		
			return media;
	}

	@Override
	public double mediaTapones(Jugador jugador) {
	    media = 0;

		  String query = "SELECT AVG(tapones_por_partido) FROM estadisticas WHERE jugador = ?";
		    PreparedStatement pst = null;
		    ResultSet rs = null;
		    try {
		        pst = conn.prepareStatement(query);
		        pst.setInt(1, jugador.getCodigo());  
		        rs = pst.executeQuery();

		        if (rs.next()) {
		            media = rs.getDouble("AVG(tapones_por_partido)");
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    } finally {
		        try {
		            if (rs != null) rs.close();
		            if (pst != null) pst.close();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }
		
			return media;
	}

	@Override
	public double mediaRebotes(Jugador jugador) {
	    media = 0;

		  String query = "SELECT AVG(rebotes_por_partido) FROM estadisticas WHERE jugador = ?";
		    PreparedStatement pst = null;
		    ResultSet rs = null;
		    try {
		        pst = conn.prepareStatement(query);
		        pst.setInt(1, jugador.getCodigo());  
		        rs = pst.executeQuery();

		        if (rs.next()) {
		            media = rs.getDouble("AVG(rebotes_por_partido)");
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    } finally {
		        try {
		            if (rs != null) rs.close();
		            if (pst != null) pst.close();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }
		return media;
	}

}
