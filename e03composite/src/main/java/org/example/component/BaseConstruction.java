package org.example.component;

public abstract class BaseConstruction implements ConstructionComponent{
    protected String name;
    protected String assignedWorker;

    public BaseConstruction(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void assignWorker(String workerName) {
        this.assignedWorker = workerName;
        System.out.println("Worker " + workerName + " assigned to: " + name);
    }

    @Override
    public void add(ConstructionComponent component) {
        throw new UnsupportedOperationException("Cannot add to a simple task.");
    }

    @Override
    public void remove(ConstructionComponent component) {
        throw new UnsupportedOperationException("Cannot remove from a simple task.");
    }

    @Override
    public ConstructionComponent getChild(int i) {
        throw new UnsupportedOperationException("No children for a simple task.");
    }

    @Override
    public void paint() {
        System.out.println("Rendering: " + name);
    }
}
