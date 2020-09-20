import searching.BinarySearch;
import searching.LinearSearch;
import searching.Search;
import sorting.*;

public class PracticeApplication {

    public static void main(String[] args) {
        System.out.println("Data - structure");
    }

    static void bubbleSorting() {
        Sort bubbleSort = new BubbleSort(5);
        bubbleSort.perform();
    }

    static void insertionSort() {
        Sort insertionSort = new InsertionSort(30);
        insertionSort.perform();
    }

    static void selectionSort() {
        Sort selectionSort = new SelectionSort(10);
        selectionSort.perform();
    }

    static void quickSort() {
        Sort quickSort = new QuickSort();
        quickSort.perform();
    }

    static void mergeSort() {
        MergeSort mergeSort = new MergeSort();
        mergeSort.test();
    }

    static void linearSearch(int[] array, int searchElement) {
        Search linearSearch = new LinearSearch(array);
        System.out.println(linearSearch.search(searchElement) ? "Found" : "Not Found");
    }

    static void binarySearch(int[] array, int searchElement) {
        Search binarySearch = new BinarySearch(array);
        System.out.println(binarySearch.search(searchElement) ? "Found" : "Not Found");
    }
}
