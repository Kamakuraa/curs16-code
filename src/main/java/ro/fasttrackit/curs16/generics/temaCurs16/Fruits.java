package ro.fasttrackit.curs16.generics.temaCurs16;

public abstract class Fruits implements ShopItem{
    private final String name;
    private final int price;
    private final Category category;

    public Fruits(String name, int price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public Category category() {
        return category;
    }
}
