package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMYSQL {

    private String url, user, pass;
    private static Connection conn;

    private ConexionMYSQL() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.url = "jdbc:mysql://localhost:3306/nba";
            this.user = "root";
            this.pass= "";
            try {
                conn = DriverManager.getConnection(url, user, pass);
    
            } catch (SQLException e) {
                System.out.println("Ha habido algún problema en la conexión");
                e.printStackTrace();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        if(conn == null) {
            new ConexionMYSQL();
        }
        return conn;
    }
}
