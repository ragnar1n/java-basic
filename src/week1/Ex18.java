package week1;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter points:");
        int points = Integer.parseInt(reader.nextLine());
        System.out.println("Input points "+ points);


        if (points<30){
            System.out.println("Grade: failed");
        } else if (points >= 30 && points<35) {
            System.out.println("Grade: 1");
        } else if (points >= 35 && points<40) {
            System.out.println("Grade: 2");
        } else if (points >= 40 && points<45) {
            System.out.println("Grade: 3");
        } else if (points >= 45 && points<50) {
            System.out.println("Grade: 4");
        } else if (points >= 50 && points<60) {
            System.out.println("Grade: 5");
        }
    }
}
