package ro.fasttrackit.curs16.generics.temaCurs16;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShopItemService shopItemService = new ShopItemService(List.of(
                new Clothes("T-Shirt", 100, Category.ON_SALE) {
                    @Override
                    public <T> void add(T shopClothes) {

                    }
                }
        ));


    }
}
