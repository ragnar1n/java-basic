package week3;

import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        System.out.println("Type a (long) word: ");
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        System.out.println("Length of the first part (number): ");
        Scanner l = new Scanner(System.in);
        int length = Integer.parseInt(reader.nextLine());

        String result=word.substring(0,length);
        System.out.println(result);
    }
}
