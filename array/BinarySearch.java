package array;

/**
 * BINARY SEARCH ALGORITHM.
 * It is searching algorithm used in a SORTED ARRAY by
 * repeatedly dividing the search interval in half.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5};
        int[] array2 = new int[]{45, 6435, 34, 23154, 57, 345, 314, 56};
        System.out.println(binarySearch(array1, array1.length, 4));
        System.out.println(binarySearch(array2, array2.length, 2));
    }

    /**
     * search function for find k.
     *
     * @param arr given array
     * @param n   array size
     * @param k   key
     * @return return index
     */
    static int binarySearch(int[] arr, int n, int k) {
        return binarySearchRec(arr, 0, n - 1, k);
    }

    /**
     * Recursive function to find k.
     *
     * @param arr given array
     * @param l   point to low
     * @param h   point to high
     * @param k   key
     * @return return index
     */
    private static int binarySearchRec(int[] arr, int l, int h, int k) {

        int mid = l + (h - l) / 2;
        if (h < mid)
            return -1;

        if (arr[mid] == k)
            return mid;

        if (k > arr[mid])
            return binarySearchRec(arr, mid + 1, h, k);

        if (k < arr[mid])
            return binarySearchRec(arr, l, mid - 1, k);

        return -1;
    }
}
