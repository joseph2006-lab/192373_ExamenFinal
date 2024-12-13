
import management.AgenteManager;
import management.AnomaliaManager;
import utils.ConsoleUtils;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido a Matrix Reloaded: Salvando la Humanidad");
        System.out.println("Elige una píldora para continuar:");
        System.out.println("1. Píldora Roja: Agentes de la Resistencia");
        System.out.println("2. Píldora Azul: Control de Anomalías");

        int opcion = ConsoleUtils.leerEntero("Selecciona una opción 1/2: ");

        switch (opcion) {
            case 1 -> {
                AgenteManager agenteManager = new AgenteManager();
                agenteManager.mostrarMenu();
            }
            case 2 -> {
                AnomaliaManager anomaliaManager = new AnomaliaManager();
                anomaliaManager.mostrarMenu();
            }
            default ->
                System.out.println("Opción no válida. Adiós.");
        }
    }
}
