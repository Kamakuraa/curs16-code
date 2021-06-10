package ro.fasttrackit.curs16.generics.temaCurs16;

//addItem(T item)
//
//findByCategory(Category cat): List<T>
//
//findWithLowerPrice(int maxPrice) : List<T>
//
//findByName(String name) : Optional<T>
//
//removeItem(String name): Optional<T>

import java.util.ArrayList;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ShopItemService<T extends ShopItem> {
    private final List<T> shopItems = new ArrayList<>();

    public ShopItemService() {
        this.shopItems.addAll(shopItems);
    }

    public ShopItemService(List<Clothes> clothes) {
    }

    public Optional<T> addItem(T item) {
        for (T shopClothes : shopItems) {
            shopItems.add(item);
            return Optional.of(shopClothes);
        }
        return Optional.empty();
    }

    public List<T> findByCategory(Category cat) {
        List<T> result = new ArrayList<>();
        for (T shopClothes : shopItems) {
            shopClothes.getPrice();
            result.add(shopClothes);
        }
        return result;

    }

    public List<T> findWithLowerPrice(int maxPrice) {
        List<T> result = new ArrayList<>();
        for (T shopClothes : shopItems) {
            if (shopClothes.getPrice() < maxPrice) {
                result.add(shopClothes);
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopItemService<?> service = (ShopItemService<?>) o;
        return Objects.equals(shopItems, service.shopItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopItems);
    }

    @Override
    public String toString() {
        return "ShopItemService{" +
                "shopItems=" + shopItems +
                '}';
    }


}
