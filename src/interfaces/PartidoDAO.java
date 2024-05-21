package interfaces;

import modelos.Equipo;
import modelos.Partido;

public interface PartidoDAO {

	void visualizarDatos();
	double mediaPuntos(Equipo equipo);
	double mediaAsistencias(Equipo equipo);
	double mediaTapones(Equipo equipo);
	double mediaRebotes(Equipo equipo);
	double mediaPuntosLocal(Partido partido);
	double mediaPuntosVisitante(Partido partido);
	double porcentajeVictorias(Partido partido);

}
