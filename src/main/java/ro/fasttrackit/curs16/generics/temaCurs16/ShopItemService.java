package ro.fasttrackit.curs16.generics.temaCurs16;

import com.sun.source.tree.BreakTree;
import ro.fasttrackit.curs16.generics.reluareCurs16.Palindrome;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class ShopItemService<T extends ShopItem> {
    private final List<T> shopItems = new ArrayList<>();

    public ShopItemService() {
        this.shopItems.addAll(shopItems);
    }

    public ShopItemService(List<Clothes> clothes) {
    }

//    public Optional<T> add(T item) {
//        for (T shopClothes : shopItems) {

//    }

}
