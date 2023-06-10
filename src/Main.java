import java.util.Scanner;

public class Main {
    public static int readIntInput(Scanner sc) {
        while (true) {
            try {
                String input = sc.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter an integer value: ");
            }
        }
    }
    public static void main (String[]args){
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Scanner sc = new Scanner(System.in);
            boolean running = true;
            while (running) {
                System.out.println(" ------------------------------------------------------------------------------------------");
                System.out.println("|                   Welcome to the Coffee Machine Simulator By Madhur..!!                  |");
                System.out.println(" ------------------------------------------------------------------------------------------");
                System.out.println("\n--------Available options----------");
                System.out.println(" 1: buy\n 2: fill \n 3: take \n 4: show \n 5: analytics \n 6: exit");
                System.out.println(" -------------------------------- \n\n");
                System.out.print("Enter your choice: ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "buy" -> {
                        System.out.println("Available coffees:");
                        for (int i = 0; i < coffeeMachine.getCoffees().length; i++) {
                            Coffee coffee = coffeeMachine.getCoffees()[i];
                            System.out.println((i + 1) + ". " + coffee.getName() + " - $" + coffee.getPrice());
                        }
                        System.out.print("Enter the number of the coffee you want to buy: ");
                        int coffeeIndex = readIntInput(sc) - 1;
                        if (coffeeIndex >= 0 && coffeeIndex < coffeeMachine.getCoffees().length) {
                             coffeeMachine.buyCoffee(coffeeIndex);
                        } else {
                            System.out.println("Invalid coffee selection.");
                        }
                    }
                    case "fill" -> {
                        System.out.print("Enter the amount of water to add (in ml): ");
                        int addedWater = readIntInput(sc);
                        System.out.print("Enter the amount of milk to add (in ml): ");
                        int addedMilk = readIntInput(sc);
                        System.out.print("Enter the amount of coffee beans to add (in g): ");
                        int addedCoffeeBeans = readIntInput(sc);
                        coffeeMachine.fillIngredients(addedWater, addedMilk, addedCoffeeBeans);
                    }
                    case "take" -> coffeeMachine.takeMoney();
                    case "show" -> coffeeMachine.showIngredients();
                    case "analytics" -> coffeeMachine.showAnalytics();
                    case "exit" -> running = false;
                }
            }
            System.out.println("Thank you for using the Coffee Machine Simulator!");
    }
}