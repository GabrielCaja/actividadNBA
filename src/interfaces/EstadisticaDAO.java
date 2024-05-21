/*@author
 * Gabriel Caja
 */
package interfaces;

import java.util.List;

import modelos.Estadistica;
import modelos.Jugador;

/**
 * The Interface EstadisticaDAO.
 */
public interface EstadisticaDAO {
	
	/**
	 * Find by id.
	 *
	 * @param codigo the codigo
	 * @return the list
	 */
	List<Estadistica> findById(int codigo);

	/**
	 * Find by country.
	 *
	 * @param country the country
	 * @return the list
	 */
	List<Estadistica> findByCountry(String country);

	/**
	 * Find by equipo.
	 *
	 * @param nombre the nombre
	 * @return the list
	 */
	List<Estadistica> findByEquipo(String nombre);

	/**
	 * Media puntos partido.
	 *
	 * @param jugador the jugador
	 * @return the double
	 */
	double mediaPuntosPartido(Jugador jugador);

	/**
	 * Media asistencias.
	 *
	 * @param jugador the jugador
	 * @return the double
	 */
	double mediaAsistencias(Jugador jugador);

	/**
	 * Media tapones.
	 *
	 * @param jugador the jugador
	 * @return the double
	 */
	double mediaTapones(Jugador jugador);

	/**
	 * Media rebotes.
	 *
	 * @param jugador the jugador
	 * @return the double
	 */
	double mediaRebotes(Jugador jugador);
}
