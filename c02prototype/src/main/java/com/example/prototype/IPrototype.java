package com.example.prototype;

public interface IPrototype<T extends IPrototype> extends Cloneable{

    //Cualquier clase que implemente IPrototype, estamos diciendo
    //que se podrá clonar

    // Clonacion simple / Simple clone
    public T clone();

    // Clonacion profunda / Deep clone
    public T deepClone();
}
