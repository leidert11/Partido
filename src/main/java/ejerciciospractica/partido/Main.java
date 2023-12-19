
package ejerciciospractica.partido;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Partido partido = null;

        int opcion;
        do {
            System.out.println("---- Menú de Gestión de Partidos ----");
            System.out.println("1. Registrar un partido de Liga");
            System.out.println("2. Registrar un partido de PlayOff");
            System.out.println("3. Finalizar un partido");
            System.out.println("4. Mostrar ganador del partido");
            System.out.println("5. Mostrar información del partido");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner
            
            switch (opcion) {
                case 1:
                    // Registrar un partido de Liga
                    System.out.print("Ingrese equipo local: ");
                    String equipoLocalLiga = scanner.nextLine();
                    System.out.print("Ingrese equipo visitante: ");
                    String equipoVisitanteLiga = scanner.nextLine();
                    System.out.print("Ingrese jornada: ");
                    int jornada = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    System.out.print("Ingrese fecha del partido: ");
                    String fechaPartidoLiga = scanner.nextLine();

                    partido = new PartidoLiga(equipoLocalLiga, equipoVisitanteLiga, jornada, fechaPartidoLiga);
                    System.out.println("Partido de Liga registrado correctamente.");
                    break;
                case 2:
                    // Registrar un partido de PlayOff
                    System.out.print("Ingrese equipo local: ");
                    String equipoLocalPlayOff = scanner.nextLine();
                    System.out.print("Ingrese equipo visitante: ");
                    String equipoVisitantePlayOff = scanner.nextLine();
                    System.out.print("Ingrese ronda: ");
                    String ronda = scanner.nextLine();
                    System.out.print("Ingrese fecha del partido: ");
                    String fechaPartidoPlayOff = scanner.nextLine();

                    partido = new PartidoPlayoff(equipoLocalPlayOff, equipoVisitantePlayOff, ronda, fechaPartidoPlayOff);
                    System.out.println("Partido de PlayOff registrado correctamente.");
                    break;
                case 3:
                    // Finalizar un partido
                    if (partido != null) {
                        partido.finalizarPartido();
                        System.out.println("Partido finalizado.");
                    } else {
                        System.out.println("No se ha registrado ningún partido.");
                    }
                    break;
                case 4:
                    // Mostrar ganador del partido
                    if (partido != null) {
                        String ganador = partido.obtenerGanador();
                        System.out.println("El ganador del partido es: " + ganador);
                    } else {
                        System.out.println("No se ha registrado ningún partido.");
                    }
                    break;
                case 5:
                    // Mostrar información del partido
                    if (partido != null) {
                        String informacionPartido = partido.mostrarPartido();
                        System.out.println("Información del partido:");
                        System.out.println(informacionPartido);
                    } else {
                        System.out.println("No se ha registrado ningún partido.");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del sistema de gestión de partidos...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}