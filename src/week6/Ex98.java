package week6;

import java.sql.Array;
import java.util.Arrays;

public class Ex98 {
    public static void main(String[] args) {
        int[] original = {1, 5, 3, 4};
        int[] copied = copy(original);
        int[] reverse = reverseCopy(original);

        // change the copied
        copied[0] = 33;

        // print both
        System.out.println( "original: " + Arrays.toString(original));
        System.out.println( "copied: " + Arrays.toString(copied));
        System.out.println( "reversed: " + Arrays.toString(reverse));
    }

    public static int[] copy(int[] array){
        int[] arrayCopy=new int[4];
        for (int i=1;i<4;i++){
            arrayCopy[i]=array[i];
        }
        return arrayCopy;
    }

    public static int[] reverseCopy(int[] array){
        int[] reverseArray=new int[4];
        int r=4;
        for (int i=0;i<4;i++){
        reverseArray[i]=array[r-1];
        r--;
    }
        return reverseArray;
    }
}
