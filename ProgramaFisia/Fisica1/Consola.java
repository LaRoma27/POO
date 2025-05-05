import java.util.Scanner;

public class Consola {
    private final Scanner scanner = new Scanner(System.in);
    private static final String RESET = "\033[0m";
    private static final String ROJO = "\033[31;40m";

    public double leerDouble(String mensaje) {
        System.out.print(mensaje + RESET);
        while (!scanner.hasNextDouble()) {
            System.out.println(ROJO + "Entrada no válida. Intenta de nuevo." + RESET);
            scanner.next();
            System.out.print(mensaje + RESET);
        }
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return valor;
    }

    public double leerDoublePositivo(String mensaje) {
        double valor;
        do {
            System.out.print(mensaje);
            while (!scanner.hasNextDouble()) {
                System.out.println(ROJO + "Entrada no válida. Intenta de nuevo." + RESET);
                scanner.next();
                System.out.print(mensaje + RESET);
            }
            valor = scanner.nextDouble();
            scanner.nextLine();
            if (valor <= 0) {
                System.out.println(ROJO + "El valor debe ser mayor que cero. Intenta de nuevo." + RESET);
            }
        } while (valor <= 0);
        return valor;
    }

    public int leerEntero(String mensaje) {
        System.out.print(mensaje + RESET);
        while (!scanner.hasNextInt()) {
            System.out.println(ROJO + "Entrada no válida. Intenta de nuevo." + RESET);
            scanner.next();
            System.out.print(mensaje + RESET);
        }
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }
}