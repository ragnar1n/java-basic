package week1;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        System.out.println("How old are you?");
        Scanner reader = new Scanner(System.in);
        int age = Integer.parseInt(reader.nextLine());
        System.out.println("A:" + age);

        if (age >= 0 && age <= 180) {
            System.out.println("ok");
        } else {
            System.out.println("I don't believe you");
        }
    }
}
