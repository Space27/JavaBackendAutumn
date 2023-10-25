package edu.project2;

public class Cell {

    public enum Type {
        WALL,
        PASSAGE
    }

    Type type;

    public Cell() {
        this.type = Type.WALL;
    }

    public Cell(Type type) {
        this.type = Type.WALL;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
