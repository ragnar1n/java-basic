package week10;

public class ExH {
    public static void main(String[] args) {
        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is  " +healthyBurger.printHamburger());
    }
}
