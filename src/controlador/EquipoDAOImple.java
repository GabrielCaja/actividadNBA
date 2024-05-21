package controlador;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import conexion.AbstractConexion;
import conexion.ConexionMYSQL;
import conexion.app;
import interfaces.EquipoDAO;
import modelos.Equipo;

public class EquipoDAOImple extends AbstractConexion implements EquipoDAO {

	private Equipo equipo = new Equipo();
	private boolean equipoCreado,cambioDivision;
	Scanner sc = new Scanner(System.in);
	private static int filasAfectadas;
	@Override
	public Equipo findById(String nombre) {
		try {
			quitarRestricciones();
			query = "SELECT * FROM equipos WHERE Nombre = ? ";
			
			pst = conn.prepareStatement(query);
			
			pst.setString(1, nombre);
			rs = pst.executeQuery();

			while (rs.next()) {
				String nombreEquipo = rs.getString(1);
				String ciudad = rs.getString(2);
				String conferencia = rs.getString(3);
				String division = rs.getString(4);
				
				equipo = new Equipo(nombreEquipo, ciudad, conferencia, division);
			}
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return equipo;	
	}

	@Override
	public List<Equipo> findAll() {
		try {
			st = conn.createStatement();
			query = "SELECT * FROM equipos;";
			rs = st.executeQuery(query);

			while (rs.next()) {
				System.out.println(rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int eliminarEquipo(String nombre) {
		try {
			quitarRestricciones();
			query = "DELETE FROM equipos WHERE Nombre = ? ";
			pst = conn.prepareStatement(query);
			pst.setString(1, nombre);
			filasAfectadas = pst.executeUpdate();
			System.out.println("Equipo eliminado con exito");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return filasAfectadas;
	}

	@Override
	public boolean crearEquipo(Equipo equipo) {
		try {			
				quitarRestricciones();
				query = "INSERT INTO equipos (nombre, ciudad, conferencia, division)VALUES (?,?,?,?);";
				
				pst = conn.prepareStatement(query);
				pst.setString(1, equipo.getNombre());
				pst.setString(2, equipo.getCiudad());
				pst.setString(3, equipo.getConferencia());
				pst.setString(4, equipo.getDivision());

				filasAfectadas = pst.executeUpdate();
				equipoCreado = true;
		} catch (SQLException e) {
			e.printStackTrace();
			equipoCreado = false;
		}
		
		return equipoCreado;	
	}

	@Override
	public boolean cambioDivision(Equipo equipo) {
		
		try {			
			quitarRestricciones();
			query = "UPDATE equipos SET division = ? WHERE nombre = ?;";
			System.out.println("Que equipo quieres cambiar?");
			String nombreEquipoDivision = sc.next();
			System.out.println("A que divison quieres cambiarla?");
			String divisionCambiada = sc.next();
			pst = conn.prepareStatement(query);
			pst.setString(1, divisionCambiada);
			pst.setString(2, nombreEquipoDivision);
			
			filasAfectadas = pst.executeUpdate();
			cambioDivision=true;
			System.out.println(findById(nombreEquipoDivision));

	} catch (SQLException e) {
		e.printStackTrace();
		cambioDivision=false;
	}
		return cambioDivision;
	}

}
