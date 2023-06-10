
public class CoffeeMachine {
    private int water;
    private int milk;
    private int coffeeBeans;
    private int money;
    private int espressoCupsSold;
    private int latteCupsSold;
    private int cappuccinoCupsSold;
    private int totalMoneyEarned;

    private Coffee[] coffees = {
            new Coffee("Espresso", 4, 250, 0, 16),
            new Coffee("Latte", 7, 350, 75, 20),
            new Coffee("Cappuccino", 6, 200, 100, 12)
    };

    public CoffeeMachine() {
        water = 1000;
        milk = 1000;
        coffeeBeans = 1000;
        money = 0;
        espressoCupsSold = 0;
        latteCupsSold = 0;
        cappuccinoCupsSold = 0;
        totalMoneyEarned = 0;
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

    public int getMoney() {
        return money;
    }

    public int getEspressoCupsSold() {
        return espressoCupsSold;
    }

    public int getLatteCupsSold() {
        return latteCupsSold;
    }

    public int getCappuccinoCupsSold() {
        return cappuccinoCupsSold;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public Coffee[] getCoffees() {
        return coffees;
    }

    //Buy
    public void buyCoffee(int coffeeIndex){
        Coffee coffee = coffees[coffeeIndex];

        if(hasEnoughIngredients(coffee)){
            System.out.println("----------Dispensing "+coffee.getName()+ ". Enjoy your coffee!-----------");
            water -= coffee.getWater();
            milk -= coffee.getMilk();
            coffeeBeans -= coffee.getCoffeeBeans();
            money += coffee.getPrice();
            incrementCoffeeCupsSold(coffeeIndex);
        }else{
            System.out.println("Sorry, not enough ingredients to make "+ coffee.getName()+".");
        }
    }
    private boolean hasEnoughIngredients(Coffee coffee){
        return water >= coffee.getWater() && milk >= coffee.getMilk() && coffeeBeans >= coffee.getCoffeeBeans();
    }

    private void incrementCoffeeCupsSold(int coffeeIndex){
        if (coffeeIndex == 0) {
            espressoCupsSold++;
        } else if (coffeeIndex == 1) {
            latteCupsSold++;
        } else if (coffeeIndex == 2) {
            cappuccinoCupsSold++;
        }
    }

    //Fill
    public void fillIngredients(int addedWater, int addedMilk, int addedCoffeeBeans){
        if (addedWater >= 0 && addedMilk >= 0 && addedCoffeeBeans >= 0) {
            water += addedWater;
            milk += addedMilk;
            coffeeBeans += addedCoffeeBeans;
            System.out.println("Ingredients successfully added.");
        } else {
            System.out.println("Invalid ingredient amounts. Ingredients not added.");
        }
    }

    //take
    public void takeMoney() {
        if (money > 0) {
            System.out.println("Taking $" + money + " from the money box.");
            totalMoneyEarned += money;
            money = 0;
        } else {
            System.out.println("No money in the money box to take.");
        }
    }

    //show
    public void showIngredients() {
        System.out.println("Water: " + (Math.max(water, 0)) + " ml");
        System.out.println("Milk: " + (Math.max(milk, 0)) + " ml");
        System.out.println("Coffee Beans: " + (Math.max(coffeeBeans, 0)) + " g");
        System.out.println("Money: $" + (Math.max(money, 0)));
    }

    //show analytics
    public void showAnalytics() {
        System.out.println("Espresso cups sold: " + espressoCupsSold);
        System.out.println("Latte cups sold: " + latteCupsSold);
        System.out.println("Cappuccino cups sold: " + cappuccinoCupsSold);
        System.out.println("Total money earned: $" + getTotalMoneyEarned());
    }
}
