package searching;

public abstract class Search {

    public int[] array;

    Search(int[] array) {
        this.array = array;
    }

    public abstract boolean search(int element);
}
