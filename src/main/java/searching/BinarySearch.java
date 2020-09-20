package searching;

public class BinarySearch extends Search {

    public BinarySearch(int[] array) {
        super(array);
    }

    @Override
    public boolean search(int element) {
        int low = 0;
        int high = array.length - 1;
        int index = perform(this.array, low, high, element);
        return index != -1;
    }

    int perform(int[] array, int low, int high, int element) {
        int mid = (low + high) / 2;
        if (low <= high) {
            if (element == array[mid]) {
                return mid;
            } else if (element < array[mid]) {
                return perform(array, low, mid, element);
            } else {
                return perform(array, mid + 1, high, element);
            }
        }
        return -1;
    }

}
