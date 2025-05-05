public class Vista {
    private static final String RESET = "\033[0m";
    private static final String ROJO = "\033[31m";
    private static final String Magenta = "\033[35m";
    private static final String Verde  = " \033[32m";
    private static final String AMARILLO = "\033[33m";
    private static final String FONDO_NEGRO = "\033[40m";

    public void mostrarMenu(Consola consola) {
        int opcion;
        do {
            System.out.println(FONDO_NEGRO + Verde  + "\n=== Calculadora de Movimiento ===" + RESET);
            System.out.println(FONDO_NEGRO + Magenta + "1. Movimiento Rectilíneo Uniforme (MRU)" + RESET);
            System.out.println(FONDO_NEGRO + Magenta + "2. Movimiento Rectilíneo Uniformemente Acelerado (MRUA)" + RESET);
            System.out.println(FONDO_NEGRO + Magenta + "3. Caída Libre" + RESET);
            System.out.println(FONDO_NEGRO + Magenta + "4. Movimiento en dos dimensiones" + RESET);
            System.out.println(ROJO + "5. Salir" + RESET);

            opcion = consola.leerEntero("Elige una opción (1-5): ");
            Movimiento movimiento = null;

            switch (opcion) {
                case 1 -> movimiento = new MRU();
                case 2 -> movimiento = new MRUA();
                case 3 -> movimiento = new CaidaLibre();
                case 4 -> movimiento = new Movimiento2D();
                case 5 -> System.out.println(ROJO + "Saliendo del programa... ¡Hasta pronto!" + RESET);
                default -> System.out.println(AMARILLO + "Opción inválida. Intenta de nuevo." + RESET);
            }

            if (movimiento != null) {
                movimiento.calcular(consola);
            }
        } while (opcion != 5);
    }
}