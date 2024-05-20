package Menu;

import java.util.Scanner;

import controlador.EquipoDAOImple;
import modelos.Equipo;
import modelos.Estadistica;
import modelos.Jugador;
import modelos.Partido;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
    	EquipoDAOImple gestionEquipo = new EquipoDAOImple();
		
		
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
                                //Crear equipo con datos aportados
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
                    break;

                case 3:
                    System.out.println("Has seleccionado ESTADISTICAS");
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
