package sorting;

public class SelectionSort extends Sort {

    SelectionSort() {

    }

    public SelectionSort(int size) {
        super(size);
    }

    @Override
    public void perform() {
        printBefore();
        int i, j, minimum = 0, temp = 0;
        for (i = 0; i < array.length - 1; i++) {
            minimum = i;
            for (j = i + 1; j < array.length; j++) {
                if (array[j] < array[minimum]) {
                    minimum = j;
                }
            }
            temp = array[i];
            array[i] = array[minimum];
            array[minimum] = temp;
        }
        print();
    }

    @Override
    public void print() {
        System.out.println("\n Array after selection sort");
        display();
    }

    @Override
    public void printBefore() {
        System.out.println("\n Array before selection sort");
        display();
    }
}
