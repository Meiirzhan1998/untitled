import java.util.Arrays;

class CustomArrayList {
    private int size;
    private int capacity;
    private String[] elements;

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }

    public CustomArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    public void addAll(CustomArrayList list) {
        String[] newArray = new String[this.size + list.size];

        for (int i = 0; i < this.size; i++) {
            newArray[i] = this.elements[i];
        }

        for (int i = this.size, j = 0; i < newArray.length; i++) {
            newArray[i] = list.elements[j];
            j++;
        }
        this.elements = newArray;
    }

    public void remove(int index) {
        String[] newArray = new String[elements.length - 1];

        for (int i = 0, j = index; i < newArray.length; i++) {
            if (i != j) {
                newArray[i] = elements[i];
            }
            if (i == j) {
                j++;
                newArray[i] = elements[j];
            }
        }
        elements = newArray;
    }

    public String get(int index) {
        return elements[index];
    }

    private void grow() {
        capacity = (int) (capacity * 1.5);
        String[] elements2 = new String[capacity];
        for (int i = 0; i < elements.length; i++) {
            elements2[i] = elements[i];
        }
        elements = elements2;
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

    public String[] getElements() {
        return elements;
    }

    public void setElements(String[] elements) {
        this.elements = elements;
    }
}