/*@author
 * Gabriel Caja
 */
package interfaces;

import modelos.Equipo;
import modelos.Partido;

/**
 * The Interface PartidoDAO.
 */
public interface PartidoDAO {

	/**
	 * Visualizar datos.
	 */
	void visualizarDatos();
	
	/**
	 * Media puntos.
	 *
	 * @param equipo the equipo
	 * @return the double
	 */
	double mediaPuntos(Equipo equipo);
	
	/**
	 * Media asistencias.
	 *
	 * @param equipo the equipo
	 * @return the double
	 */
	double mediaAsistencias(Equipo equipo);
	
	/**
	 * Media tapones.
	 *
	 * @param equipo the equipo
	 * @return the double
	 */
	double mediaTapones(Equipo equipo);
	
	/**
	 * Media rebotes.
	 *
	 * @param equipo the equipo
	 * @return the double
	 */
	double mediaRebotes(Equipo equipo);
	
	/**
	 * Media puntos local.
	 *
	 * @param partido the partido
	 * @return the double
	 */
	double mediaPuntosLocal(Partido partido);
	
	/**
	 * Media puntos visitante.
	 *
	 * @param partido the partido
	 * @return the double
	 */
	double mediaPuntosVisitante(Partido partido);
	
	/**
	 * Porcentaje victorias.
	 *
	 * @param partido the partido
	 * @return the double
	 */
	double porcentajeVictorias(Partido partido);

}
