package week4;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
        meals.add("Pasta");
        meals.add("Soup");
    }

    public void printMeals(){
        System.out.println("Menu: "+this.meals);
    }
    public void clearMenu(){
        meals.clear();
    }
}
