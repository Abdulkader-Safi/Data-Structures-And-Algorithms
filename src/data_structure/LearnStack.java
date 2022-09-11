package data_structure;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {

        /*
         * stack 1. LIFO data structure. last in first out 2. stores objects into a sort
         * of 'vertical tower'
         */

        Stack<String> stack = new Stack<String>();

        System.out.println("is stack empty: " + stack.empty());
        /*
         * stack.empty() return if the stack is empty or not boolean : true or false
         */

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("BorderLands");
        stack.push("GTA 5");
        /*
         * stack.push() add item to stack
         */
        // System.out.println("is stack empty: " + stack.empty());

        System.out.println(stack.search("BorderLands"));
        /*
         * stack.search() give the index of item we are searching for stack start from 1
         * not from 0 so BorderLands in this case = 4
         */

        String lastGame1 = stack.peek();
        System.out.println(lastGame1);
        String lastGame2 = stack.pop();
        System.out.println(lastGame2);
        /*
         * stack.peek() get last item from stack with out removeing it stack.pop() get
         * and remove last item from stack
         */

        System.out.println(stack);

        /*
         * uses of stack? 1. undo / redo features in text editors 2. moving back /
         * forward through browser history 3. backtracking algorithems (maze, file
         * directorys) 4. calling functions (call stack)
         */
    }
}
