package array;


import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        rotateArray(arr, 2, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void rotateArray(int[] arr, int d, int n) {
        while (--d >= 0) {
            int t = arr[0];
            for (int i = 1; i < n; i++) {
                arr[i - 1] = arr[i];
            }
            arr[n - 1] = t;
        }
    }
}
