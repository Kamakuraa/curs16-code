package ro.fasttrackit.curs16.generics;

import java.util.Objects;

public class LimitedBox<T extends Number> {
    private final T box;

    public LimitedBox(T box) {

        this.box = box;
    }

    public T getBox() {
        return box;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LimitedBox<?> that = (LimitedBox<?>) o;
        return Objects.equals(box, that.box);
    }

    @Override
    public int hashCode() {
        return Objects.hash(box);
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "box=" + box +
                '}';
    }

    public T getObject() {
        return null;
    }
}
