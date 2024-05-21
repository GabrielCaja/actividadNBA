package Menu;

import java.util.Scanner;

import controlador.EquipoDAOImple;
import controlador.EstadisticasDAOImple;
import controlador.JugadorDAOImple;
import modelos.Equipo;
import modelos.Estadistica;
import modelos.Jugador;
import modelos.Partido;

public class Menu {

	public void displayMenu() {

		Scanner sc = new Scanner(System.in);
		int opcion;
		EquipoDAOImple gestionEquipo = new EquipoDAOImple();
		JugadorDAOImple gestionJugador = new JugadorDAOImple();
		EstadisticasDAOImple gestionStats = new EstadisticasDAOImple();

		Equipo equipos = new Equipo();
		Estadistica stats = new Estadistica();
		Jugador jugador = new Jugador();
		Partido partido = new Partido();

		do {
			System.out.println("-----MENU-----");
			System.out.println("1. Equipos");
			System.out.println("2. Jugadores");
			System.out.println("3. Estadisticas");
			System.out.println("4. Partidos");
			System.out.println("5. Salir");

			System.out.print("Introduzca una opcion: ");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				int opcionEquipos;
				do {
					System.out.println("-----SUB-MENU EQUIPOS-----");
					System.out.println("1. Listar todos los equipos");
					System.out.println("2. Buscar equipo por nombre");
					System.out.println("3. Crear equipo");
					System.out.println("4. Eliminar equipo");
					System.out.println("5. Cambiar división de equipo");
					System.out.println("6. Volver al menú principal");

					System.out.print("Introduzca una opcion: ");
					opcionEquipos = sc.nextInt();

					switch (opcionEquipos) {
					case 1:
						System.out.println("Listando todos los equipos...");
						System.out.println("EQUIPOS");
						gestionEquipo.findAll();
						break;
					case 2:
						System.out.println("Introduce el equipo que quieras buscar");
						String buscarNombre = sc.next();
						System.out.println(gestionEquipo.findById(buscarNombre));
						break;
					case 3:
						System.out.println("Creando equipo...");
						System.out.println("Nombre:");
						String nombreE = sc.next();
						System.out.println("Ciudad:");
						String ciudadE = sc.next();
						System.out.println("Conferencia:");
						String conferenciaE = sc.next();
						System.out.println("Division:");
						String divisionE = sc.next();
						// Crear equipo con datos aportados
						Equipo equipoCreado = new Equipo(nombreE, ciudadE, conferenciaE, divisionE);
						System.out.println(gestionEquipo.crearEquipo(equipoCreado));
						gestionEquipo.findAll();
						break;
					case 4:
						System.out.println("Que equipos quieres eliminar?");
						String eliminarNombre = sc.next();
						System.out.println(gestionEquipo.eliminarEquipo(eliminarNombre));
						break;
					case 5:
						System.out.println("Cambiando división de equipo...");
						equipoCreado = new Equipo("EquipoPropio1", "Madrid", "Tres", "Primera");
						System.out.println(gestionEquipo.cambioDivision(equipoCreado));
						break;
					case 6:
						System.out.println("Volviendo al menú principal...");
						break;
					default:
						System.out.println("Opción no válida. Intente nuevamente.");
						break;
					}
				} while (opcionEquipos != 6);
				break;

			case 2:
				System.out.println("Has seleccionado JUGADORES");
				int opcionJugadores;
				do {
					System.out.println("-----SUB-MENU JUGADORES-----");
					System.out.println("1. Listar todos los jugadores");
					System.out.println("2. Buscar jugadores por nombre");
					System.out.println("3. Crear jugador");
					System.out.println("4. Fichar Jugador");
					System.out.println("5. Pruebas fisicas jugador");
					System.out.println("6. Retirar jugador");
					System.out.println("7. Volver al menú principal");

					System.out.print("Introduzca una opcion: ");
					opcionJugadores = sc.nextInt();

					switch (opcionJugadores) {
					case 1:
						System.out.println("Listando todos los jugadores...");
						System.out.println("JUGADORES");
						gestionJugador.findAll();
						break;
					case 2:
						System.out.println("Introduce el jugador que quieras buscar");
						sc = new Scanner(System.in);
						String buscarNombre = sc.nextLine();
						System.out.println(gestionJugador.findById(buscarNombre));
						break;
					case 3:
						System.out.println("Creando jugador...");
						System.out.println("Codigo:");
						int codigo = sc.nextInt();
						System.out.println("Nombre:");
						String nombreJugador = sc.next();
						System.out.println("Procedencia:");
						String procedencia = sc.next();
						System.out.println("altura:");
						String altura = sc.next();
						System.out.println("Peso:");
						int peso = sc.nextInt();
						System.out.println("Posicion:");
						String posicion = sc.next();
						System.out.println("Nombre Equipo:");
						String nombreEquipo = sc.next();
						// Crear equipo con datos aportados
						Jugador jugadorCreado = new Jugador(codigo, nombreJugador, procedencia, altura, peso, posicion,
								nombreEquipo);
						System.out.println(gestionJugador.crearJugador(jugadorCreado));
						gestionJugador.findAll();
						break;
					case 4:
						jugadorCreado = new Jugador(1212, "Gabriel", "Procedencia", "175", 12, "delantero", "Madrid");
						System.out.println(gestionJugador.ficharJugador(jugadorCreado));
						break;
					case 5:
						// No entiendo
						break;
					case 6:
						System.out.println("Que jugador quieres eliminar?");
						int codigoJu = sc.nextInt();
						System.out.println(gestionJugador.retirarJugador(codigoJu));
						break;
					case 7:
						System.out.println("Volviendo al menú principal...");
						break;
					default:
						System.out.println("Opción no válida. Intente nuevamente.");
						break;
					}
				} while (opcionJugadores != 7);
				break;

			case 3:
				System.out.println("Has seleccionado ESTADISTICAS");
				int opcionStats;
				do {
					System.out.println("-----SUB-MENU ESTADISTICAS-----");
					System.out.println("1. Mostrar estadisticas por jugador");
					System.out.println("2. Mostrar estadisticas por ubicacion");
					System.out.println("3. Mostrar estadisticas por equipo");
					System.out.println("4. Media de puntos partido de jugador");
					System.out.println("5. Media de asistencias partido de jugador");
					System.out.println("6. Media de tapones partido de jugador");
					System.out.println("7. Media de rebotes partido de jugador");
					System.out.println("8. Volver al menú principal");

					System.out.print("Introduzca una opcion: ");
					opcionStats = sc.nextInt();

					switch (opcionStats) {
					case 1:
						System.out.println("Introduce el jugador que quieras buscar estadisticas");
						sc = new Scanner(System.in);
						String buscarNombreStat = sc.nextLine();
						Jugador jugadorStats12 = gestionJugador.findById(buscarNombreStat);
						System.out.println(gestionStats.findById(jugadorStats12.getCodigo()));
						break;
					case 2:
						System.out.println("Introduce el jugador que quieras buscar estadisticas");
						sc = new Scanner(System.in);
						String buscarNombreStat2 = sc.nextLine();
						System.out.println(gestionStats.findByCountry(buscarNombreStat2));
						break;
					case 3:
						
						sc = new Scanner(System.in);
						String buscarNombreStat3 = sc.nextLine();
						System.out.println(gestionStats.findByEquipo(buscarNombreStat3));
						
						
						
						
						break;
					case 4:
						System.out.println("Introduce el jugador que quieras buscar");
						sc = new Scanner(System.in);
						String buscarNombre = sc.nextLine();
						Jugador jugadorStats1 = gestionJugador.findById(buscarNombre);
						System.out.println(gestionStats.mediaPuntosPartido(jugadorStats1));
						break;
					case 5:
						System.out.println("Introduce el jugador que quieras buscar su media de asistencias");
						sc = new Scanner(System.in);
						String buscarNombre2 = sc.nextLine();
						Jugador jugadorStats2 = gestionJugador.findById(buscarNombre2);
						System.out.println(gestionStats.mediaAsistencias(jugadorStats2));
						break;
					case 6:
						System.out.println("Introduce el jugador que quieras saber su media de tapones");
						sc = new Scanner(System.in);
						String buscarNombre3 = sc.nextLine();
						Jugador jugadorStats3 = gestionJugador.findById(buscarNombre3);
						System.out.println(gestionStats.mediaTapones(jugadorStats3));
						break;
					case 7:
						System.out.println("Introduce el jugador que quieras saber su media de rebotes");
						sc = new Scanner(System.in);
						String buscarNombre4 = sc.nextLine();
						Jugador jugadorStats4 = gestionJugador.findById(buscarNombre4);
						System.out.println(gestionStats.mediaRebotes(jugadorStats4));
						break;
					case 8:
						break;
					default:
						break;
					}
				} while (opcionStats != 8);
				break;

			case 4:
				System.out.println("Has seleccionado PARTIDOS");
				break;

			case 5:
				System.out.println("Saliendo del programa...");
				break;

			default:
				System.out.println("Introduce otra opción válida.");
				break;
			}
		} while (opcion != 5);

		sc.close();
	}
}
