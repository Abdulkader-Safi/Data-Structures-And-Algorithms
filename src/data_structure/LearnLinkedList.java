package data_structure;

import java.util.LinkedList;

public class LearnLinkedList {
    public static void main(String[] args) {
        /*
         * linked list 
         * stores nodes in 2 parts (data + address)
         * node are in non-consecutive memory locations
         * elements are linked using pointers
         *          Singly Linked list
         *      Node                    Node                Node
         *  [data - address]  ->  [data - address]  ->  [data - address]
         * 
         *          Doubly Linked list
         *              Node                            Node
         *  [address - data - address]  ->  [address - data - address] 
         */
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        /*
         * linkedList.push() add element to the linked list in the front
         * linkedList.offer() add element to the linked list to the list
         */

        linkedList.add(4, "E");
        linkedList.addFirst("First");
        linkedList.addLast("Last");
        /*
         * linkedList.add() add element to the linked list in specific index
         * linkedList.addFirst() add new element in the front of the linked list
         * linkedList.addLast() add new element at the end of the linked list
         */

        // linkedList.pop();
        linkedList.remove("F");
        /*
         * linkedList.pop() get last item from linked list linkedList.romove() remove
         * the element from the linked list
         * 
         */

        System.out.println(linkedList.indexOf("A"));
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        /*
         * linkedlist.indexOf() get the index of element linkedList.peekFirst() get the
         * first element of the linked list linkedList.peekLast() get the last element
         * in the linked list
         */

        System.out.println(linkedList);

        /*
         * advantages
         * 1. Dynamic data structure (allocates needed memory while running)
         * 2. Inserting and deleting of nodes is easy. O(1)
         * 2. No/Low memory waste
         */

        /*
         * uses
         * 1. implement Stacks/Queues
         * 2. GPS navigation
         * 3. music playlist
         */
    }
}
