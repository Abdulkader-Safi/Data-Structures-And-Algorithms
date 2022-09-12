package algorithms;

public class LearnInsertionSort {
    public static void main(String[] args) {
        /*
         * Insertion sort after comparing elements to the left shift elements to the
         * right to make room to insert a value
         * 
         * Quadratic time O(n^2) decent with small data set bad with large data set
         * 
         * less steps than Bubble Sort best case is O(n)
         */

        int[] array = { 9, 1, 8, 2, 7, 3, 6, 5, 4 };

        insertionSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = temp;
        }
    }
}
