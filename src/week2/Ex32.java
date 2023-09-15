package week2;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        System.out.println("Until what number?");
        Scanner reader = new Scanner(System.in);
        int num = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int add = 1;
        int i = 0;
        while (i < num) {
            sum=sum+ add;
            add++;
            i++;
        }
        System.out.println("Sum is:" +sum);
    }
}
