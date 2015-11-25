package lesson6.menu;


public class Menu {

    private String name;
    Drink[] drinks = new Drink[100];
    private int EXIST_DRINK = 0;

    public Menu(String name) {
        this.name = name;
    }

    public Drink[] getDrinks() {
        return drinks;
    }

    public String getName() {
        return name;
    }

    public void addDrink(Drink drink) {

        drinks[EXIST_DRINK] = drink;
        EXIST_DRINK++;
    }
}
