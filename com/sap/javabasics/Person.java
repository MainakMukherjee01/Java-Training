package com.sap.javabasics;

import java.util.HashMap;
import java.util.Map;

public class Person {
    private final String name;
    private final Map<String, Collectable> collection;

    public Person(String name) {
        this.name = name;
        this.collection = new HashMap<>();
    }

    public void addCollectable(Collectable collectable) {
        collection.put(collectable.getUniqueId(), collectable);
    }

    public int getNumberOfCollectedThings() {
        return collection.size();
    }

    public Collectable getCollectableById(String uniqueId) {
        return collection.get(uniqueId);
    }

    @Override
    public String toString() {
        return "Person {" + "name =' " + name + " \'" + ", collection = " + collection.values() + " }";
    }
}
