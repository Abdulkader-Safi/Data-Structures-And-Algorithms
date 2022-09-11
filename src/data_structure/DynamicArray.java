package data_structure;

public class DynamicArray {
    private int size;
    private int capacity = 10;
    private Object[] array;

    public DynamicArray() {
        this.array = new Object[this.capacity];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[this.capacity];
    }

    public void add(Object data) {
        if (this.size >= this.capacity) {
            this.grow();
        }
        array[this.size] = data;
        this.size++;
    }

    public void insert(int index, Object data) {
        if (this.size >= this.capacity) {
            grow();
        }

        for (int i = this.size; i > index; i--) {
            this.array[i] = this.array[i - 1];
        }
        array[index] = data;
        size++;
    }

    public void delete(Object data) {
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] == data) {
                for (int j = 0; j < (this.size - i - 1); j++) {
                    this.array[i + j] = this.array[i + j + 1];
                }
                array[this.size - 1] = null;
                this.size--;
                if (this.size <= (int) (this.capacity / 3)) {
                    shrink();
                }
                break;
            }
        }
    }

    public int search(Object data) {
        for (int i = 0; i < this.size; i++) {
            if (this.array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    private void grow() {
        int newCapacity = (int) (this.capacity * 2);
        this.capacity = newCapacity;

        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < this.size; i++) {
            newArray[i] = this.array[i];
        }
        this.array = newArray;        

    }

    private void shrink() {
        int newCapacity = (int) (this.capacity / 2);
        this.capacity = newCapacity;

        Object[] newArray = new Object[newCapacity];
        for (int i = 0; i < this.size; i++) {
            newArray[i] = this.array[i];
        }
        this.array = newArray; 
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

    // @Override
    // public String toString() {
    // return "DynamicArray [array=" + Arrays.toString(array) + ", capacity=" +
    // capacity + ", size=" + size + "]";
    // }

    public String toString() {
        String string = "";
        for (int i = 0; i < this.size; i++) {
            string += array[i] + ", ";
        }

        if (string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]";
        } else {
            string = "[]";
        }

        return string;
    }
}
