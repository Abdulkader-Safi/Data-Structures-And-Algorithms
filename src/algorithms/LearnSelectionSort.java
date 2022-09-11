package algorithms;

public class LearnSelectionSort {
    public static void main(String[] args) {
        /*
         * Selection Sort search through an array and keep track of the minimum value
         * during each iteration. At the end of each iteration we swap variables
         * 
         * quadratic time: O(n^2) Oky for small data set Bad for large data set
         */

        int[] array1 = { 8, 7, 9, 2, 3, 1, 5, 4, 6 };
        selectionSort(array1);
        System.out.println("sorted array: ");
        for (int i : array1) {
            System.out.print(i + " ");
        }

        int[] array2 = { 8, 7, 9, 2, 3, 1, 5, 4, 6 };
        selectionSortReverse(array2);
        System.out.println(" \nsorted array in reverse: ");
        for (int i : array2) {
            System.out.print(i + " ");
        }
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }

    private static void selectionSortReverse(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] < array[j]) {
                    min = j;
                }
            }

            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
