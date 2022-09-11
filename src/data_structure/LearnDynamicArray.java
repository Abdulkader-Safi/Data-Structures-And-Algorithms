package data_structure;

public class LearnDynamicArray {
    public static void main(String[] args) {

        DynamicArray dynamicArray = new DynamicArray(5);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        dynamicArray.insert(7, "G");

        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");
        dynamicArray.delete("D");

        System.out.println("index of E: " + dynamicArray.search("E"));
        System.out.println("index of C: " + dynamicArray.search("C"));

        System.out.println("Capacity: " + dynamicArray.getCapacity());
        System.out.println("Size: " + dynamicArray.getSize());
        System.out.println("Empty: " + dynamicArray.isEmpty());

        System.out.println(dynamicArray);

        /*
         * advantages 1. Random access of elements O(1) 2. Good locality of reference
         * and data cache utilization 3. Easy to insert/delete at the end
         * 
         * disadvantages 1. Wastes more memory from linked list 2. Shifting elements is
         * time consuming O(n) 3. Expanding/Shrinking the array is time consuming O(n)
         */
    }
}
