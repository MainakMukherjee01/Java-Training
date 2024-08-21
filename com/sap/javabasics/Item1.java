package com.sap.javabasics;

public class Item1 implements Collectable {
    private final String uniqueId;

    public Item1(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    @Override
    public String getUniqueId() {
        return uniqueId;
    }

    @Override
    public String toString() {
        return "Item1{" + "uniqueId='" + uniqueId + '\'' + '}';
    }
}

