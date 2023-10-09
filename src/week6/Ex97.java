package week6;

public class Ex97 {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        String comma="";
        for( int number : array) {
                System.out.print(comma+number);
                comma=", ";
        }
    }
}
