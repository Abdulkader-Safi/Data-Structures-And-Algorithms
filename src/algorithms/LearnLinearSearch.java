package algorithms;

public class LearnLinearSearch {
    public static void main(String[] args) {
        /*
         * Linear Search Iterate through a collection one element at a time run time
         * complexity: O(n)
         */

        int[] array = { 9, 1, 4, 2, 6, 3, 5, 8 };

        
        int index = linearSearch(array, 4);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }

        System.out.println("");
        index = linearSearch(array, 5);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }

        System.out.println("");
        index = linearSearch(array, 11);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }

        /*
         * Advantages Fast for searches of small to medium data sets does not need data
         * to be sorted useful for data structures that do not have random access
         * (Linked list)
         * 
         * Disadvantages Slow for large data sets
         */
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
