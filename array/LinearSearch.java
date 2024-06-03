package array;

/**
 * LINEAR SEARCH ALGORITHM
 * It is a sequential search algorithm that starts at one end and goes through each element of a list
 * until the desired element is found, otherwise the search continues till the end of the array.
 */
public class LinearSearch {

    public static void main(String[] args) {
        int[] array = new int[]{8, 3, 7, 4, 0, 8, 1};
        System.out.println(findKeyByLinearSearch(array, 0));
        System.out.println(findKeyByLinearSearch(array, 34));
    }

    /**
     * find key in array.
     *
     * @param array given array
     * @param key   key to find in array
     * @return index of key and if not present then return -1
     */
    private static int findKeyByLinearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

}
