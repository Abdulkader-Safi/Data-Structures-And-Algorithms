package algorithms;

public class LearnRecursion {
    public static void main(String[] args) {
        /*
         * recursion when a thing is defined in terms of itself apply the result of a
         * procedure, to a procedure A recursive method calls itself. Can be substitute
         * for iteration. Divide a problem into sub-problems of the some type os the
         * original. Commonly used with advanced sorting algorithms and navigating trees
         */

        walk(5);

        System.out.println(factorial(3));

        System.out.println(power(2, 8));

        /*
         * Advantages 1. easier to read/write 2. easier to debug
         * 
         * Disadvantages 1. sometimes slower 2. uses more memory
         */
    }

    private static void walk(int steps) {
        if (steps < 1) {
            return;
        } // Base case
        System.out.println("You take a step!");
        walk(steps - 1); // Recursive case
    }

    private static int factorial(int num) {
        if (num < 1) {
            return 1;
        } // Base case

        return num * factorial(num - 1); // Recursive

    }

    private static int power(int base, int exponent) {
        if (exponent < 1) {
            return 1;
        }
        return base * power(base, exponent-1); // Recursive

    }
}
