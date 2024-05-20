package conexion;

import java.sql.Connection;

import controlador.EquipoDAOImple;
import modelos.Equipo;
import modelos.Estadistica;
import modelos.Jugador;
import modelos.Partido;

public class Conexiones extends AbstractConexion {

	static Connection conn;
	public static void main(String[] args) {
		try {
			EquipoDAOImple gestionEquipo = new EquipoDAOImple();
			
			
			Equipo equipos = new Equipo();
			Estadistica stats = new Estadistica();
			Jugador jugador = new Jugador();
			Partido partido = new Partido();
			
			//Equipos
			System.out.println("EQUIPOS");
			gestionEquipo.findAll();
			//gestionEquipo.eliminarEquipo("Bulls");
			gestionEquipo.findAll();
			System.out.println(gestionEquipo.findById("Cavaliers"));
			//Crear un equipo
			Equipo equipoCreado = new Equipo("EquipoPropio1", "Madrid", "Dos", "Primera");
			System.out.println(gestionEquipo.crearEquipo(equipoCreado));
			gestionEquipo.findAll();

			//Cambiar divison al equipo
			equipoCreado = new Equipo("EquipoPropio1", "Madrid", "Tres", "Primera");
			System.out.println(gestionEquipo.cambioDivision(equipoCreado));
			System.out.println(gestionEquipo.findById("EquipoPropio1"));

			//Jugadores
			
			
			
			
			
			
			
			
			//Estadisticas
			/*
			System.out.println("ESTADISTICAS");
			stats.mostrarEstadiscticas();
			System.out.println("JUGADORES");
			jugador.mostrarJugador();
			System.out.println("PARTIDO");
			partido.mostrarPartido();
			*/
			conn = ConexionMYSQL.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
