package org.example;

import org.example.component.ConstructionComponent;
import org.example.component.SingleTask;
import org.example.component.SubProject;

public class Main {
    public static void main(String[] args) {
        // Crear tareas individuales
        ConstructionComponent excavation = new SingleTask("Excavar", 5000);
        ConstructionComponent foundation = new SingleTask("Cimentar", 10000);
        ConstructionComponent framing = new SingleTask("Construir estructura", 15000);
        ConstructionComponent landscaping = new SingleTask("Paisajismo", 7000);

        // Crear un subproyecto para la construcción del edificio principal
        SubProject buildingConstruction = new SubProject("Construcción del Edificio Principal");
        buildingConstruction.add(excavation);
        buildingConstruction.add(foundation);
        buildingConstruction.add(framing);

        // Crear un subproyecto para las áreas verdes
        SubProject outdoorArea = new SubProject("Áreas Verdes");
        outdoorArea.add(landscaping);

        // Crear el proyecto principal de la construcción
        SubProject mainProject = new SubProject("Proyecto de Construcción");
        mainProject.add(buildingConstruction);
        mainProject.add(outdoorArea);

        // Mostrar detalles del proyecto
        System.out.println(mainProject.getDetails());

        // Asignar trabajadores a las tareas
        mainProject.assignWorker("Carlos");

        // Renderizar el proyecto completo
        mainProject.paint();

        // Calcular el costo total del proyecto
        System.out.println("Costo total del proyecto: $" + mainProject.getCost());
    }
}