package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.AbstractConexion;
import interfaces.PartidoDAO;
import modelos.Equipo;
import modelos.Partido;

public class PartidoDAOImple extends AbstractConexion implements PartidoDAO {
	private double mediaPuntos,mediaAsistencias,mediaTapones,mediaRebotes,mediaPuntosLocal;
	@Override
	public void visualizarDatos() {
        try {
            Statement st = conn.createStatement();
            String query = "SELECT * FROM PARTIDOS;";
            ResultSet rs = st.executeQuery(query);
        	System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s%n", "[Codigo]", "[Equipo_Local]", "[Equipo_Visitante]", " [Puntos_Local]", "[Puntos_Visitante]", "[TEMPORADA]");

            while(rs.next()) {
            	System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s%n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));            }

        } catch (SQLException e) {
            System.out.println("Ha habido algún problema en la conexión");
            e.printStackTrace();
        }
	}

	@Override
	public double mediaPuntos(Equipo equipo) {
		
		mediaPuntos = 0;
		  String query = "SELECT AVG(puntos_local) as mediaPuntos FROM partidos WHERE equipo_local = ?";
		    PreparedStatement pst = null;
		    ResultSet rs = null;
		    try {
		        pst = conn.prepareStatement(query);
		        pst.setString(1, equipo.getNombre());  
		        rs = pst.executeQuery();

		        if (rs.next()) {
		        	mediaPuntos = rs.getDouble("mediaPuntos");
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
		return mediaPuntos;
	}

	@Override
	public double mediaAsistencias(Equipo equipo) {
		mediaAsistencias = 0;
		  String query = "SELECT AVG(Asistencias_por_partido) as mediaAsistencias FROM partidos INNER JOIN ESTADISTICAS ON estadisticas.temporada = partidos.temporada WHERE equipo_local = ?";
		    PreparedStatement pst = null;
		    ResultSet rs = null;
		    try {
		        pst = conn.prepareStatement(query);
		        pst.setString(1, equipo.getNombre());  
		        rs = pst.executeQuery();

		        if (rs.next()) {
		        	mediaAsistencias = rs.getDouble("mediaAsistencias");
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
		return mediaAsistencias;
	}

	@Override
	public double mediaTapones(Equipo equipo) {
		mediaTapones = 0;
		  String query = "SELECT AVG(Tapones_por_partido) as mediaTapones FROM partidos INNER JOIN ESTADISTICAS ON estadisticas.temporada = partidos.temporada WHERE equipo_local = ?";
		    PreparedStatement pst = null;
		    ResultSet rs = null;
		    try {
		        pst = conn.prepareStatement(query);
		        pst.setString(1, equipo.getNombre());  
		        rs = pst.executeQuery();

		        if (rs.next()) {
		        	mediaTapones = rs.getDouble("mediaTapones");
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
		return mediaTapones;
	}

	@Override
	public double mediaRebotes(Equipo equipo) {
		mediaRebotes = 0;
		  String query = "SELECT AVG(rebotes_por_partido) as mediaRebotes FROM partidos INNER JOIN ESTADISTICAS ON estadisticas.temporada = partidos.temporada WHERE equipo_local = ?";
		    PreparedStatement pst = null;
		    ResultSet rs = null;
		    try {
		        pst = conn.prepareStatement(query);
		        pst.setString(1, equipo.getNombre());  
		        rs = pst.executeQuery();

		        if (rs.next()) {
		        	mediaRebotes = rs.getDouble("mediaRebotes");
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
		return mediaRebotes;
	}

	@Override
	public double mediaPuntosLocal(Partido partido) {
		mediaPuntosLocal = 0;
		  String query = "SELECT AVG(puntos_local) AS mediaPuntosLocal FROM partidos WHERE id = ?";
		    PreparedStatement pst = null;
		    ResultSet rs = null;
		    try {
		        pst = conn.prepareStatement(query);
		        pst.setInt(1, partido.getCodigo());  
		        rs = pst.executeQuery();

		        if (rs.next()) {
		        	mediaPuntosLocal = rs.getDouble("mediaPuntosLocal");
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
		return mediaPuntosLocal;
	}

	@Override
	public double mediaPuntosVisitante(Partido partido) {

		
		
		return 0;
	}

	@Override
	public double porcentajeVictorias(Partido partido) {


		
		return 0;
	}

	
	
	
	
}
