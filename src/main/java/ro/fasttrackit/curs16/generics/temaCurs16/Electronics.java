package ro.fasttrackit.curs16.generics.temaCurs16;

public abstract class Electronics implements ShopItem {
    private String name;
    private int price;
    private Category category;

    public Electronics(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int[] getPrice() {
        return new int[0];
    }

    @Override
    public Category category() {
        return null;
    }


}
