import linkedList.doubly.DoublyLinkedList;
import searching.BinarySearch;
import searching.LinearSearch;
import searching.Search;
import sorting.*;

public class PracticeApplication {

    public static void main(String[] args) {
        try {
            DoublyLinkedList list = new DoublyLinkedList();
            list.add(10);
            list.add(20);
            list.add(23);
            list.addAtIndex(0, 500);
            list.removeFromStart();
            list.removeFromStart();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("\nException : " + e.getMessage());
        }
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
