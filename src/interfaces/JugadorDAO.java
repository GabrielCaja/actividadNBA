/*@author
 * Gabriel Caja
 */
package interfaces;

import java.util.List;

import modelos.Jugador;

/**
 * The Interface JugadorDAO.
 */
public interface JugadorDAO {

	/**
	 * Find by id.
	 *
	 * @param nombre the nombre
	 * @return the jugador
	 */
	Jugador findById(String nombre);
	
	/**
	 * Find all.
	 *
	 * @return the list
	 */
	List<Jugador> findAll();
	
	/**
	 * Crear jugador.
	 *
	 * @param jugador the jugador
	 * @return true, if successful
	 */
	boolean crearJugador(Jugador jugador);
	
	/**
	 * Fichar jugador.
	 *
	 * @param jugador the jugador
	 * @return true, if successful
	 */
	boolean ficharJugador(Jugador jugador);
	
	/**
	 * Pruebas fisicas jugador.
	 *
	 * @param jugador the jugador
	 * @return true, if successful
	 */
	boolean pruebasFisicasJugador(Jugador jugador);
	
	/**
	 * Retirar jugador.
	 *
	 * @param codigo the codigo
	 * @return the int
	 */
	int retirarJugador(int codigo);
}
