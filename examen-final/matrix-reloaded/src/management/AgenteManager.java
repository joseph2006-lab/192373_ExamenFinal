package management;

import entities.Agente;
import java.util.ArrayList;
import utils.ConsoleUtils;

public class AgenteManager {

    private final ArrayList<Agente> agentes;

    public AgenteManager() {
        this.agentes = new ArrayList<>();
    }

    public void registrarAgente() {
        int id = ConsoleUtils.leerEntero("Ingrese el ID del agente: ");
        ConsoleUtils.limpiarBuffer();

        String nombre = ConsoleUtils.leerTexto("Ingrese el nombre del agente: ");
        String habilidad = ConsoleUtils.leerTexto("Ingrese la habilidad especial del agente: ");

        Agente nuevoAgente = new Agente(id, nombre, habilidad);
        agentes.add(nuevoAgente);
        System.out.println("Agente registrado con éxito.");
    }

    public void mostrarAgentes() {
        if (agentes.isEmpty()) {
            System.out.println("No hay agentes registrados.");
            return;
        }
        System.out.println("=== Lista de Agentes ===");
        for (Agente agente : agentes) {
            System.out.println(agente);
        }
    }

    public void incrementarNivelAgente() {
        if (agentes.isEmpty()) {
            System.out.println("No hay agentes registrados.");
            return;
        }

        System.out.println("=== Agentes Disponibles ===");
        for (int i = 0; i < agentes.size(); i++) {
            System.out.println(i + ") " + agentes.get(i));
        }

        int indice = ConsoleUtils.leerEntero("Seleccione el número del agente a incrementar nivel: ");
        ConsoleUtils.limpiarBuffer();

        if (indice >= 0 && indice < agentes.size()) {
            Agente agente = agentes.get(indice);
            agente.incrementarNivel();
            System.out.println("Información actualizada del agente:");
            System.out.println(agente);
        } else {
            System.out.println("Índice de agente no válido.");
        }
    }

    public void mostrarMenu() {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n=== Menú Agentes ===");
            System.out.println("1. Registrar nuevo Agente");
            System.out.println("2. Mostrar Agentes");
            System.out.println("3. Incrementar Nivel del Agente");
            System.out.println("4. Salir");
            int opcion = ConsoleUtils.leerEntero("Seleccione una opción: ");
            ConsoleUtils.limpiarBuffer();

            switch (opcion) {
                case 1 ->
                    registrarAgente();
                case 2 ->
                    mostrarAgentes();
                case 3 ->
                    incrementarNivelAgente();
                case 4 ->
                    continuar = false;
                default ->
                    System.out.println("Porfavor ingrese una opcion valida");
            }
        }
    }
}
