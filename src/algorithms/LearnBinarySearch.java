package algorithms;

public class LearnBinarySearch {
    public static void main(String[] args) {
        /*
         * Binary Search
         * Search algorithm that finds the position of a target value within a sorted array
         * halt of the array is eliminated during each "step"  
         */

        int[] array = new int[100_000_000];
        int target = 777_777;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int index = binarySearch(array, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int binarySearch(int[] array, int target) {
        int low = 0;
        int hight = array.length - 1;

        while (low <= hight) {
            int middle = low + (hight - low) / 2;
            int value = array[middle];

            if (value < target) {
                low = middle + 1;
            } else if (value > target) {
                hight = middle + 1;
            } else {
                return middle;
            }
        }

        return -1; // target not found
    }
}
