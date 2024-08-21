package com.sap.javabasics;


public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe");

        Collectable item1 = new Item1("id1");
        Collectable item2 = new Item2("id2");
        Collectable item3 = new Item3("id3");

        person.addCollectable(item1);
        person.addCollectable(item2);
        person.addCollectable(item1);
        person.addCollectable(item3);


        System.out.println(person);

        System.out.println("Number of collected things: " + person.getNumberOfCollectedThings());

        Collectable retrievedItem = person.getCollectableById("id1");
        System.out.println("Retrieved Item: " + retrievedItem);
        retrievedItem = person.getCollectableById("id2");
        System.out.println("Retrieved Item: " + retrievedItem);
        retrievedItem = person.getCollectableById("id3");
        System.out.println("Retrieved Item: " + retrievedItem);
    }
}
