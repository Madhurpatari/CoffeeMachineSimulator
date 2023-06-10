public class Coffee {
    private String name;
    private int price;
    private int water;
    private int milk;
    private int coffeeBeans;

    public Coffee(String name, int price, int water, int milk, int coffeeBeans) {
        this.name = name;
        this.price = price;
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }
}
