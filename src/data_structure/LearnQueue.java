package data_structure;

import java.util.Queue;
import java.util.LinkedList;

public class LearnQueue {
    public static void main(String[] args) {
        /*
         * Queue 1. FIFO data structure. first in first out 2. A collection designed for
         * holding elements prior to processing 3. linear data structure
         */

        Queue<String> queue = new LinkedList<String>();

        queue.add("Abdulkader Safi");
        queue.offer("Adham Safi");
        /*
         * queue.add() / queue.offer() add element to the tail of the queue the last
         */

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Abdulkader"));
        /*
         * queue.isEmpty() return if the queue is empty or not / boolean : true or false
         * queue.size() give the size or the length of the queue queue.contains() check
         * if the element available in the queue
         */

        String firstInQueue1 = queue.peek();
        System.out.println(firstInQueue1);
        String firstInQueue2 = queue.poll();
        System.out.println(firstInQueue2);
        /*
         * queue.peek() give the first element in queue with out removing the element
         * form the queue queue.poll() give and remove the first element from the queue
         */

        System.out.println(queue);

        /*
         * uses of queue? 1. keyboard buffer (letters should appear on the screen in the
         * order they're pressed) 2. Printer Queue (Print jobs should be completed in
         * order) 3. used in linkedLists, PriorityQueues, Breadth-first search
         */
    }
}
