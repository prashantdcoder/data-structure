package sorting;

public class InsertionSort extends Sort {

    public InsertionSort() {
    }

    public InsertionSort(int size) {
        super(size);
    }

    @Override
    public void perform() {
        printBefore();
        setStartTime();
        int size = array.length;
        int key, i, j;

        for (i = 1; i <= size - 1; i++) {
            key = array[i];
            j = i;
            while (j > 0 && array[j - 1] > key) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = key;
        }
        setEndTime();
        calculateRunningTime();
        print();
    }

    @Override
    public void print() {
        System.out.println("\nList after insertion sorting");
        display();
    }

    @Override
    public void printBefore() {
        System.out.println("\nList before insertion sorting");
        display();
    }
}
