package sorting;

public class MergeSort extends Sort {

    public MergeSort() {

    }

    public MergeSort(int size) {
        super(size);
    }

    @Override
    public void print() {
        System.out.println("\n Array after merge sorting");
        display();
    }

    @Override
    public void printBefore() {
        System.out.println("\n Array before merge sorting");
        display();
    }

    @Override
    public void perform() {
        try {
            printBefore();
            perform(this.array, 0, array.length - 1);
            print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void perform(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            perform(array, left, middle);
            perform(array, (middle + 1), right);
            merge(array, left, middle, right);
        }
    }

    public void merge(int[] array, int left, int middle, int right) {
        int i = 0, j = 0, k = 0;
        int n1 = middle - left + 1;
        int n2 = right - middle;
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }
        for (j = 0; j < n2; ++j) {
            rightArray[j] = array[middle + 1 + j];
        }

        i = 0;
        j = 0;
        k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[i]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public void test() {
    }
}
