package linkedList.doubly;

public class Node {

    int value;
    Node previous;
    Node next;

    public Node() {
        int value = 0;
        this.previous = null;
        this.next = null;
    }

    public Node(int value) {
        this.value = value;
        this.previous = null;
        this.next = null;
    }
}
