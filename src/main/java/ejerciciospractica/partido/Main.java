
package ejerciciospractica.partido;

import java.util.*;

public class Main {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Partido> partidos = new ArrayList<>();

        while (true) {
            System.out.println("Bienvenido al sistema de partidos");
            System.out.println("1. Registrar partido");
            System.out.println("2. Información del partido");
            System.out.println("3. Cambiar el estado del partido");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Gracias por utilizar el sistema de partidos");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida");
            }

            System.out.println();
        }
    }
}