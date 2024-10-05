package org.example.component;

public class SingleTask extends BaseConstruction{
    private double cost;

    public SingleTask(String name, double cost) {
        super(name);
        this.cost = cost;
    }

    @Override
    public String getDetails() {
        return "Task: " + name + " (Cost: $" + cost + ")";
    }

    @Override
    public double getCost() {
        return cost;
    }
}
