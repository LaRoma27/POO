public class Controlador {
    private Vista vista;
    private Consola consola;

    public Controlador() {
        vista = new Vista();
        consola = new Consola();
    }

    public void iniciar() {
        vista.mostrarMenu(consola);
    }
}