/*@author
 * Gabriel Caja
 */
package controlador;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import conexion.AbstractConexion;
import interfaces.JugadorDAO;
import modelos.Equipo;
import modelos.Jugador;

/**
 * The Class JugadorDAOImple.
 */
public class JugadorDAOImple extends AbstractConexion implements JugadorDAO {
	
	/** The result. */
	private boolean jugadorCreado, result;
	
	/** The jugador. */
	private Jugador jugador = new Jugador();
	
	/** The sc. */
	Scanner sc = new Scanner(System.in);

	/**
	 * Find by id.
	 *
	 * @param nombre the nombre
	 * @return the jugador
	 */
	@Override
	public Jugador findById(String nombre) {
		try {
			quitarRestricciones();
			query = "SELECT * FROM jugadores WHERE nombre  like ?";

			pst = conn.prepareStatement(query);

			pst.setString(1, nombre + "%");
			rs = pst.executeQuery();

			while (rs.next()) {
				int codigo = rs.getInt(1);
				String nombreJugador = rs.getString(2);
				String procedencia = rs.getString(3);
				String altura = rs.getString(4);
				int peso = rs.getInt(5);
				String posicion = rs.getString(6);
				String nombreEquipo = rs.getString(7);

				jugador = new Jugador(codigo, nombreJugador, procedencia, altura, peso, posicion, nombreEquipo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return jugador;
	}

	/**
	 * Find all.
	 *
	 * @return the list
	 */
	@Override
	public List<Jugador> findAll() {
		try {
			st = conn.createStatement();
			query = "SELECT nombre FROM jugadores;";
			rs = st.executeQuery(query);

			while (rs.next()) {
				System.out.println(rs.getString(1));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	/**
	 * Crear jugador.
	 *
	 * @param jugador the jugador
	 * @return true, if successful
	 */
	@Override
	public boolean crearJugador(Jugador jugador) {
		try {
			quitarRestricciones();
			query = "INSERT INTO jugadores (codigo,nombre,procedencia,altura,peso,posicion,nombre_equipo)VALUES (?,?,?,?,?,?,?);";

			pst = conn.prepareStatement(query);
			pst.setInt(1, jugador.getCodigo());
			pst.setString(2, jugador.getNombre());
			pst.setString(3, jugador.getProcedencia());
			pst.setString(4, jugador.getAltura());
			pst.setInt(5, jugador.getPeso());
			pst.setString(6, jugador.getPosicion());
			pst.setString(7, jugador.getNombre_equipo());

			pst.executeUpdate();
			jugadorCreado = true;
		} catch (SQLException e) {
			e.printStackTrace();
			jugadorCreado = false;
		}

		return jugadorCreado;
	}

	/**
	 * Fichar jugador.
	 *
	 * @param jugador the jugador
	 * @return true, if successful
	 */
	@Override
	public boolean ficharJugador(Jugador jugador) {
		String query = "UPDATE jugadores SET nombre_equipo = ? WHERE nombre = ?";
		try (PreparedStatement statement = conn.prepareStatement(query)) {
			statement.setString(1, jugador.getNombre_equipo());
			statement.setString(2, jugador.getNombre());
			result = statement.executeUpdate() > 0;
			result = true;
		} catch (SQLException e) {
			e.printStackTrace();
			result = false;

		}
		return result;
	}

	/**
	 * Pruebas fisicas jugador.
	 *
	 * @param jugador the jugador
	 * @return true, if successful
	 */
	@Override
	public boolean pruebasFisicasJugador(Jugador jugador) {

		return false;
	}

	/**
	 * Retirar jugador.
	 *
	 * @param codigo the codigo
	 * @return the int
	 */
	@Override
	public int retirarJugador(int codigo) {
		try {
			quitarRestricciones();
			query = "DELETE FROM jugadores WHERE Codigo = ? ";
			pst = conn.prepareStatement(query);
			pst.setInt(1, codigo);
			pst.executeUpdate();
			System.out.println("Jugador eliminado con exito");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return codigo;
	}

}
