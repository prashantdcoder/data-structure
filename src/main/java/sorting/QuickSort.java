package sorting;

public class QuickSort extends Sort {

    public QuickSort() {

    }

    public QuickSort(int size) {
        super(size);
    }

    @Override
    public void perform() {
        printBefore();
        quickSort(this.array, 0, array.length - 1);
        print();
    }

    @Override
    public void print() {
        System.out.println("\n Array after quick sort");
        display();
    }

    @Override
    public void printBefore() {
        System.out.println("\n Array before quick sort");
        display();
    }

    int partition(int[] array, int startIndex, int endIndex) {
        int pIndex = startIndex;
        int temp;
        int pivotValue = array[endIndex];
        for (int i = startIndex; i < endIndex; i++) {
            if (array[i] < pivotValue) {
                temp = array[i];
                array[i] = array[pIndex];
                array[pIndex] = temp;
                pIndex++;
            }
        }
        temp = array[endIndex];
        array[endIndex] = array[pIndex];
        array[pIndex] = temp;
        return pIndex;
    }

    void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pIndex = partition(array, start, end);
            quickSort(array, start, pIndex - 1);
            quickSort(array, pIndex + 1, end);
        }
    }
}
