package org.launchcode.java.exercises.technology;

public abstract class AbstractEntity {
    private static int nextId = 1;

    int Id;

    AbstractEntity(){
        this.Id = nextId;
        this.nextId++;
    }
    public int getId() {
        return this.Id;
    }
}
