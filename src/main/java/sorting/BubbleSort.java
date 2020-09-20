package sorting;

public class BubbleSort extends Sort {

    public BubbleSort() {

    }

    public BubbleSort(int size) {
        super(size);
    }

    @Override
    public void perform() {
        printBefore();
        int length = this.array.length;
        setStartTime();
        for (int i = 0; i < length; i++) {
            boolean isSorted = true;
            for (int j = 0; j < length - 1; j++) {
                if (this.array[j] > this.array[j + 1]) {
                    int temp = this.array[j];
                    this.array[j] = this.array[j + 1];
                    this.array[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
        setEndTime();
        calculateRunningTime();
        print();
    }

    @Override
    public void print() {
        System.out.println("\nList after bubble sorting");
        display();
    }

    @Override
    public void printBefore() {
        System.out.println("\nList before bubble sorting");
        display();
    }


}
