package data_structure;

import java.util.Queue;
import java.util.Collections;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        /*
         * Priority Queue 1. FIFO data structure. first in first out but serves elements
         * with the highest priorities first before elements with lower priority
         */

        // Queue<String> queue = new PriorityQueue<>();
        Queue<String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
