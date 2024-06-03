package array;

import java.util.Arrays;

/**
 * Basics of Array in data structure.
 */
public class ArrayDemo {

    public static void main(String[] args) {

        //declare array
        int[] array;

        //allocating memory(size) to array
        array = new int[5];
        System.out.println(Arrays.toString(array));

        //we can combine both declaration and size allocation
        int[] array2 = new int[10];
        System.out.println(Arrays.toString(array2));

        //array literal
        int[] array3 = new int[]{1,2,3};
        System.out.println(Arrays.toString(array3));

        //access elements in array
        int[] array4 = new int[]{1,2,3,4,5};
        for(int i = 0; i < array4.length; i++) {
            System.out.print(array4[i] + " ");
        }
        System.out.println();


    }
}
