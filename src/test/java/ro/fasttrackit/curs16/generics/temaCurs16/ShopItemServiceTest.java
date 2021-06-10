package ro.fasttrackit.curs16.generics.temaCurs16;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;


class ShopItemServiceTest {
    @Test
    void add(){
        ShopItemService service = new ShopItemService(List.of(
                new Clothes("t-shirt", 100, Category.ON_SALE),
                new Clothes("jacket", 100, Category.REFURBISHED),
                new Clothes("pants", 100, Category.NEW)
        ));

        Optional clothes = service.addItem(new Clothes("t-shirt", 20, Category.ON_SALE));


//        assertThat(clothes.);

    }

}