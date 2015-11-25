package lesson6.menu;


public class Drink {

    private String name;
    Ingredient[] ingr;


    public Drink(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ingredient[] getIngr() {
        return ingr;
    }

    public void addIngredients(Ingredient[] ingredient) {

        ingr = ingredient;
    }
}
