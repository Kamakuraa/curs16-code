package ro.fasttrackit.curs16.generics;

import java.util.Objects;

public class Box {
    private final Object box;

    public Box(Object box) {
        this.box = box;
    }

    public Object getBox() {
        return box;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box1 = (Box) o;
        return Objects.equals(box, box1.box);
    }

    @Override
    public int hashCode() {
        return Objects.hash(box);
    }

    @Override
    public String toString() {
        return "Box{" +
                "box=" + box +
                '}';
    }

    public Object getOject() {
        return null;
    }
}
