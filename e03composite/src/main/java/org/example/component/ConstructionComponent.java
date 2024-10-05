package org.example.component;

public interface ConstructionComponent {
    String getName();
    String getDetails();
    double getCost();
    void assignWorker(String workerName);
    void add(ConstructionComponent component);
    void remove(ConstructionComponent component);
    ConstructionComponent getChild(int i);
    void paint(); // Simulación de alguna operación gráfica (ej: mostrar estado)
}
