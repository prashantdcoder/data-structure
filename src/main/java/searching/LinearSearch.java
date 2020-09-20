package searching;

public class LinearSearch extends Search {

    public LinearSearch(int[] array) {
        super(array);
    }

    @Override
    public boolean search(int element) {
        boolean isFound = false;
        for (int i : this.array) {
            if (i == element) {
                isFound = true;
                break;
            }
        }
        return isFound;
    }
}
