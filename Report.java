package lesson6.menu;

public class Report {

    Menu menu;

    public Report() {
    }

    public void printMenu(Menu menu) {

        System.out.println(menu.getName());
        System.out.println("№ " + "  Drink  " + "  Price  " + " Volume ");
        for (int i = 0; i < menu.getDrinks().length; i++) {
            if (menu.getDrinks()[i] != null) {
                int volume = 0;
                int price = 0;
                for (int j = 0; j < menu.getDrinks()[i].getIngr().length; j++) {
                    volume += menu.getDrinks()[i].getIngr()[j].getQuantity() * menu.getDrinks()[i].getIngr()[j].getWeight();
                    price += menu.getDrinks()[i].getIngr()[j].getPrice();
                }
                System.out.println((i + 1) + "  " + menu.getDrinks()[i].getName() + "  -  " + price + " UAH,  " + volume + " ml");
            }
        }
    }
}
