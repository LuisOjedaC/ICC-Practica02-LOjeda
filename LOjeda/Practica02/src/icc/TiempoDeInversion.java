import java.util.Scanner;

/**
 * Programa para simular el tiempo y rendimiento de una inversión bancaria.
 * Objetivo: Utilizar objetos de la clase Fecha y estructuras repetitivas.
 * @author Ojeda Cruz Luis Ángel.
 * @version 1a versión.
 */
public class TiempoDeInversion {

    public static void main(String[] pps) {
        Scanner in = new Scanner(System.in);
        String nombre, respuesta;
        double monto, rendimiento;
        int diaIni, mesIni, anioIni;
        int diaFin, mesFin, anioFin;
        int dias;
        Fecha fechaInicio, fechaFin;

        // (a) Dar bienvenida y solicitar el nombre del inversionista
        System.out.println("Bienvenido al simulador de inversiones.");
        System.out.print("Por favor, dame tu nombre: ");

        // (b) Recabar el nombre del inversionista
        nombre = in.nextLine();

        do {
            // (c) Saludar al inversionista y preguntar por el monto a invertir
            System.out.println("\nHola " + nombre + ", ¿qué monto deseas invertir?");
            System.out.print("Monto: $");

            // (d) Recabar monto
            monto = in.nextDouble();

            // (e) Preguntar por una fecha inicio de inversión
            System.out.println("\nIngresa la fecha de inicio de la inversión:");
            System.out.print("Día (1-31): ");
            diaIni = in.nextInt();
            System.out.print("Mes (1-12): ");
            mesIni = in.nextInt();
            System.out.print("Año (aaaa): ");
            anioIni = in.nextInt();

            // (f) Recabar fecha inicio de inversión
            fechaInicio = new Fecha(diaIni, mesIni, anioIni);

            // (g) Preguntar por una fecha fin de inversión
            System.out.println("\nIngresa la fecha de fin de la inversión:");
            System.out.print("Día (1-31): ");
            diaFin = in.nextInt();
            System.out.print("Mes (1-12): ");
            mesFin = in.nextInt();
            System.out.print("Año (aaaa): ");
            anioFin = in.nextInt();

            // (h) Recabar fecha fin de inversión
            fechaFin = new Fecha(diaFin, mesFin, anioFin);

            // (i) Mostrar cuántos días sería su inversión y su rendimiento al 12%
            dias = fechaInicio.diferenciaDias(fechaFin);
            rendimiento = (monto * 0.12 * dias) / 365;

            System.out.println("\n--- Resumen de la simulación ---");
            System.out.println("Fecha de inicio: " + fechaInicio);
            System.out.println("Fecha de fin: " + fechaFin);
            System.out.println("Duración de la inversión: " + dias + " días.");
            System.out.println("Rendimiento generado al 12%: $" + rendimiento);
            System.out.println("Monto total al finalizar: $" + (monto + rendimiento));

            // Limpiar el salto de línea pendiente antes de leer texto con nextLine()
            in.nextLine();

            // (j) Preguntar si desea hacer otra simulación
            System.out.print("\n¿Deseas hacer otra simulación? (si/no): ");
            respuesta = in.nextLine();
            respuesta = respuesta.toLowerCase().trim();

        } while (respuesta.equals("si") || respuesta.equals("sí"));

        System.out.println("\nGracias por usar el simulador :D, " + nombre + ". ¡Hasta pronto!");
    }
}
