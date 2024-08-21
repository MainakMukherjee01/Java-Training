package com.sap.javabasics;

public class Item3 implements Collectable {
    private final String uniqueId;

    public Item3(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    @Override
    public String getUniqueId() {
        return uniqueId;
    }

    @Override
    public String toString() {
        return "Item3{" + "uniqueId='" + uniqueId + '\'' + '}';
    }
}
