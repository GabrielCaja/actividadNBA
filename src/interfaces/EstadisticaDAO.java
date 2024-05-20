package interfaces;

import java.util.List;

import modelos.Estadistica;
import modelos.Jugador;

public interface EstadisticaDAO {
	
	List<Estadistica> findById(int codigo);

	List<Estadistica> findByCountry(String country);

	List<Estadistica> findByEquipo(String nombre);

	double mediaPuntosPartido(Jugador jugador);

	double mediaAsistencias(Jugador jugador);

	double mediaTapones(Jugador jugador);

	double mediaRebotes(Jugador jugador);
}
