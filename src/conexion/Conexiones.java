package conexion;

import java.sql.Connection;

import Menu.Menu;


public class Conexiones extends AbstractConexion {

	static Connection conn;
	public static void main(String[] args) {
		try {
	
			//Llamada a la clase menu
			Menu menu = new Menu();
			menu.displayMenu();

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
