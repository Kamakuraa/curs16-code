package ro.fasttrackit.curs16.generics.temaCurs16;

import java.util.Objects;

public class Shop<T extends ShopItem> {

    private final T object;

    public Shop(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop<?> shop = (Shop<?>) o;
        return Objects.equals(object, shop.object);
    }

    @Override
    public int hashCode() {
        return Objects.hash(object);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "object=" + object +
                '}';
    }
}
