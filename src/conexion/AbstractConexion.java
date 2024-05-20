package conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class AbstractConexion {
	
		protected  Connection conn;
		protected  PreparedStatement pst;
		protected  Statement st;
		protected  ResultSet rs;
		protected  String query;
		
		protected AbstractConexion() {
			conn = ConexionMYSQL.getConnection();
			}
		
		//Metodo para quita restricciones de claves foraneas
		protected void quitarRestricciones(){
			String query2 = "SET FOREIGN_KEY_CHECKS=0";
			try {
				st = conn.createStatement();
				st.execute(query2);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
}
