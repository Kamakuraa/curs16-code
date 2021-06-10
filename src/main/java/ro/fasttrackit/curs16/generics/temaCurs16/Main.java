package ro.fasttrackit.curs16.generics.temaCurs16;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShopItemService shopItemService;
        shopItemService = new ShopItemService(List.of(
                new Clothes("T-Shirt", 50, Category.ON_SALE),
                new Clothes("Jeans", 100, Category.ON_SALE),
                new Clothes("Swimming", 99, Category.ON_SALE),
                new Clothes("Jacket and Coats", 300, Category.ON_SALE)

        ));
        System.out.println(shopItemService.findByCategory(Category.ON_SALE));
        System.out.println(shopItemService.findWithLowerPrice(101));
    }
}
