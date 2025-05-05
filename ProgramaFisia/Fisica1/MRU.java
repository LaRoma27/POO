public class MRU extends Movimiento {
    @Override
    public void calcular(Consola consola) {
        double distancia = consola.leerDouble("Ingresa la distancia (m): ");
        double tiempo = consola.leerDoublePositivo("Ingresa el tiempo (s): ");
        double velocidad = distancia / tiempo;
        System.out.println("Velocidad: " + velocidad + " m/s");
    }
}