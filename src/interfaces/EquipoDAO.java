/*@author
 * Gabriel Caja
 */
package interfaces;

import java.util.List;

import modelos.Equipo;

/**
 * The Interface EquipoDAO.
 */
public interface EquipoDAO {

	/**
	 * Find by id.
	 *
	 * @param nombre the nombre
	 * @return the equipo
	 */
	Equipo findById(String nombre);
	
	/**
	 * Find all.
	 *
	 * @return the list
	 */
	List<Equipo> findAll();
	
	/**
	 * Eliminar equipo.
	 *
	 * @param nombe the nombe
	 * @return the int
	 */
	int eliminarEquipo(String nombe);
	
	/**
	 * Crear equipo.
	 *
	 * @param equipo the equipo
	 * @return true, if successful
	 */
	boolean crearEquipo(Equipo equipo);
	
	/**
	 * Cambio division.
	 *
	 * @param equipo the equipo
	 * @return true, if successful
	 */
	boolean cambioDivision(Equipo equipo); 
	
	
}
