/*@author
 * Gabriel Caja
 */

import java.sql.Connection;

import Menu.Menu;
import conexion.AbstractConexion;
import conexion.ConexionMYSQL;

/**
 * The Class app.
 */
public class app extends AbstractConexion {

	/** The conn. */
	static Connection conn;
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
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
