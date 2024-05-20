package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import conexion.AbstractConexion;
import interfaces.EstadisticaDAO;
import modelos.Estadistica;
import modelos.Jugador;

public class EstadisticasDAOImple extends AbstractConexion implements EstadisticaDAO{
	private double media;
	@Override
	public List<Estadistica> findById(int codigo) {
		
		
		
		
		return null;
	}

	@Override
	public List<Estadistica> findByCountry(String country) {
		
		
		
		return null;
	}

	@Override
	public List<Estadistica> findByEquipo(String nombre) {
		
		
		
		return null;
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
