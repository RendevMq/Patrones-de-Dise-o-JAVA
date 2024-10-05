package org.example.component;

import java.util.ArrayList;
import java.util.List;

public class SubProject extends BaseConstruction{
    private List<ConstructionComponent> components = new ArrayList<>();

    public SubProject(String name) {
        super(name);
    }

    @Override
    public String getDetails() {
        StringBuilder details = new StringBuilder("SubProject: " + name + "\n");
        for (ConstructionComponent component : components) {
            details.append("\t").append(component.getDetails()).append("\n");
        }
        return details.toString();
    }

    @Override
    public double getCost() {
        double totalCost = 0;
        for (ConstructionComponent component : components) {
            totalCost += component.getCost();
        }
        return totalCost;
    }

    @Override
    public void add(ConstructionComponent component) {
        components.add(component);
    }

    @Override
    public void remove(ConstructionComponent component) {
        components.remove(component);
    }

    @Override
    public ConstructionComponent getChild(int i) {
        return components.get(i);
    }

    @Override
    public void paint() {
        System.out.println("Rendering subproject: " + name);
        for (ConstructionComponent component : components) {
            component.paint();
        }
    }

}
