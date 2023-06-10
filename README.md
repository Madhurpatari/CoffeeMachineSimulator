## Coffee Machine Simulator
The Coffee Machine Simulator is a console application that simulates a coffee machine. It allows users to buy different types of coffee, refill ingredients, take money from the machine, and view the remaining ingredients. The application also provides analytics on the number of coffees sold, total money earned, and ingredient consumption.

### Features
- Buy coffee: Users can select from different types of coffee and purchase them. The coffee is dispensed only if the machine has enough ingredients.
- Fill ingredients: The machine can be refilled with water, milk, and coffee beans. The user specifies the amount of each ingredient to add.
- Show ingredients: Users can check the remaining quantities of water, milk, coffee beans, and the amount of money in the machine.
- Analytics: The application provides statistics on the number of coffees sold, total money earned, and ingredient consumption. 
### Coffee Types and Ingredients
The coffee machine supports the following coffee types and their respective ingredient requirements:

#### Espresso:
- Price: $4/cup
- Water needed: 250 ml/cup
- Milk needed: 0 ml/cup
- Coffee beans needed: 16 g/cup
#### Latte:

- Price: $7/cup
- Water needed: 350 ml/cup
- Milk needed: 75 ml/cup
- Coffee beans needed: 20 g/cup
#### Cappuccino:

- Price: $6/cup
- Water needed: 200 ml/cup
- Milk needed: 100 ml/cup
- Coffee beans needed: 12 g/cup
### Usage
1. Run the Coffee Machine Simulator application.
2. Choose one of the available options:
* buy: Buy a coffee of your choice.
* fill: Refill the ingredients in the machine.
* take: Take the money from the machine.
* show: Display the remaining ingredients in the machine.
* analytics: View statistics on coffees sold, money earned, and ingredient consumption.
* exit: Stop the simulation and exit the application.
3. Follow the instructions prompted by the application for each selected option.
###  Exception Handling
The application includes exception handling to handle invalid inputs and prevent negative ingredient quantities or money values. Users will be prompted with appropriate error messages if they provide invalid inputs or if there are insufficient ingredients to make a selected coffee.

### Requirements
- Java (version 8 or above)
### Running the Application
1. Compile the Java files:

```java
javac CoffeeMachineSimulator.java
```
2. Run the compiled file:
```java
java CoffeeMachineSimulator
```