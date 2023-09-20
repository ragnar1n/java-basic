package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex60 {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<String>();
        while (true) {
        System.out.println("Type a word (enter nothing to stop): ");
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();

            if (word.isEmpty()) {
                break;
            }else {
                teachers.add(word);
            }
        }
        Collections.sort(teachers);

        for (String teacher : teachers) {
            System.out.println(teacher);
        }
    }
}