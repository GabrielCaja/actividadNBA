
import java.sql.Connection;

import Menu.Menu;
import conexion.AbstractConexion;
import conexion.ConexionMYSQL;

public class app extends AbstractConexion {

	static Connection conn;
	public static void main(String[] args) {
		try {
			//Llamada a la clase menu
			conn = ConexionMYSQL.getConnection();
			Menu menu = new Menu();
			menu.displayMenu();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
