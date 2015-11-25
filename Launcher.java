package lesson6.menu;

public class Launcher {

    public static void main(String[] args) {

        Menu menu = new Menu("TEA-COFFE Menu");
        Drink drink = new Drink("Black Coffee");
        Report report = new Report();

        Coffee coffee = new Coffee();
        coffee.setPrice(15);
        coffee.setWeight(5);
        coffee.setQuantity(1);

        Sugar sugar = new Sugar();
        sugar.setPrice(1);
        sugar.setWeight(5);
        sugar.setQuantity(1);

        Water water = new Water();
        water.setPrice(1);
        water.setWeight(100);
        water.setQuantity(1);

        BlackTea blackTea = new BlackTea();
        blackTea.setPrice(12);
        blackTea.setWeight(1);
        blackTea.setQuantity(1);

        GreenTea greenTea = new GreenTea();
        greenTea.setPrice(15);
        greenTea.setWeight(1);
        greenTea.setQuantity(1);

        TeaWithBergamot bergamot = new TeaWithBergamot();
        bergamot.setPrice(14);
        bergamot.setWeight(1);
        bergamot.setQuantity(1);

        Milk milk = new Milk();
        milk.setPrice(4);
        milk.setWeight(50);
        milk.setQuantity(1);

        drink.addIngredients(new Ingredient[]{coffee, sugar, water, water});
        menu.addDrink(drink);

        drink = new Drink("Green Tea");
        drink.addIngredients(new Ingredient[]{greenTea, water, water});
        menu.addDrink(drink);

        drink = new Drink("Latte");
        drink.addIngredients(new Ingredient[]{coffee, water, milk, milk, sugar});
        menu.addDrink(drink);

        report.printMenu(menu);
    }
}
