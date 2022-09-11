package algorithms;

public class LearnBubbleSort {
    public static void main(String[] args) {
        /*
         * Bubble Sort pairs of adjacent elements are compared and the elements swapped
         * if they are not in order
         * 
         * Quadratic time O(n^2) small data set = Oky-ish Large data set = bas
         */

        int[] array1 = { 9, 3, 4, 1, 5, 6, 7, 0, 8, 2 };
        bubbleSort(array1);
        System.out.println("sorted array: ");
        for (int i : array1) {
            System.out.print(i + " ");
        }

        int[] array2 = { 9, 3, 4, 1, 5, 6, 7, 0, 8, 2 };
        bubbleSortReverse(array2);
        System.out.println(" \nsorted array in reverse: ");
        for (int i : array2) {
            System.out.print(i + " ");
        }

    }

    private static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    private static void bubbleSortReverse(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
