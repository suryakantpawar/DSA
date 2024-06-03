package array;

import java.util.Arrays;

/**
 * Reverse given array.
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        reverseArray(array);
        System.out.println(Arrays.toString(array));
    }

    /**
     * Reverse given array using two pointers.
     *
     * @param array given array
     */
    private static void reverseArray(int[] array) {
        int i = 0, j = array.length - 1, t;
        while (j > i) {
            t = array[i];
            array[i] = array[j];
            array[j] = t;
            i++;
            j--;
        }
    }
}
