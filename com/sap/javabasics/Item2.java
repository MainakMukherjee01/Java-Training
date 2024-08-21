package com.sap.javabasics;

public class Item2 implements Collectable {
    private final String uniqueId;

    public Item2(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    @Override
    public String getUniqueId() {
        return uniqueId;
    }

    @Override
    public String toString() {
        return "Item2{" + "uniqueId='" + uniqueId + '\'' + '}';
    }
}
