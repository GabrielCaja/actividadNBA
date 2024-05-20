package controlador;

import java.util.List;

import conexion.AbstractConexion;
import interfaces.EstadisticaDAO;
import modelos.Estadistica;
import modelos.Jugador;

public class EstadisticasDAOImple extends AbstractConexion implements EstadisticaDAO{

	@Override
	public List<Estadistica> findById(int codigo) {
		return null;
	}

	@Override
	public List<Estadistica> findByCountry(String country) {
		return null;
	}

	@Override
	public List<Estadistica> findByEquipo(String nombre) {
		return null;
	}

	@Override
	public double mediaPuntosPartido(Jugador jugador) {
		return 0;
	}

	@Override
	public double mediaAsistencias(Jugador jugador) {
		return 0;
	}

	@Override
	public double mediaTapones(Jugador jugador) {
		return 0;
	}

	@Override
	public double mediaRebotes(Jugador jugador) {
		return 0;
	}

}
