package linkedList;

public class SinglyLinkedList implements List {

    private Node head;

    private void setHead(Node node) {
        this.head = node;
    }

    private Node getHead() {
        return this.head;
    }

    @Override
    public void add(int value) {
        Node node = new Node(value);
        Node current = getHead();
        if (current == null) {
            setHead(node);
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        System.out.println("\n inserting element at end");
        show();
    }

    public void addAtIndex(int index, int value) throws IndexOutOfBoundsException {
        Node node = new Node(value);
        int listIndex = 1;
        Node current = getHead();
        if (current == null) {
            setHead(node);
        } else if (index == 0) {
            node.next = current;
            current = node;
            setHead(current);
        } else if (index >= size() || index < 0) {
            throw new IndexOutOfBoundsException("Please provide valid index");
        } else {
            while (listIndex != index) {
                current = current.next;
                listIndex++;
            }
            node.next = current.next;
            current.next = node;
        }
        System.out.println("\n inserting element at " + index);
        show();
    }

    @Override
    public void removeFromStart() {
        Node current = getHead();
        Node nextNode = current.next;
        setHead(nextNode);
        System.out.println("\n removing element from start");
        show();
    }

    @Override
    public void removeFromEnd() {
        int size = size();

        if (size == 0) {
            throw new IndexOutOfBoundsException("Cannot perform remove from empty list");
        } else if (size == 1) {
            setHead(null);
        } else {
            Node current = getHead();
            int count = 1;
            while (count < size - 1) {
                current = current.next;
                count++;
            }
            Node secondLastNode = current;
            secondLastNode.next = null;
        }
        System.out.println("\n removing element from end");
        show();
    }

    @Override
    public void show() {
        Node headStart = head;
        if (headStart == null) {
            System.out.println(" List is empty");
        } else {
            while (headStart != null) {
                System.out.print("[" + headStart.value + "]");
                headStart = headStart.next;
            }
        }
    }

    @Override
    public int size() {
        Node current = getHead();
        int count = 1;
        if (current == null) {
            count = 0;
        } else {
            while (current.next != null) {
                current = current.next;
                count++;
            }
        }
        return count;
    }

    @Override
    public void removeFromIndex(int index) {
        Node current = getHead();
        Node previous = current;
        int count = 0;

        if (current == null) {
            throw new IndexOutOfBoundsException("Cannot remove element from empty list");
        } else if (index > size() - 1) {
            throw new IndexOutOfBoundsException("No element exists at this index");
        } else if (index == 0 && (size() - 1) > 0) {
            removeFromStart();
        } else if (index == 0 && (size() - 1) == 0) {
            setHead(null);
        } else {
            while (count < index) {
                previous = current;
                current = current.next;
                count++;
            }
        }
        previous.next = current.next;
        current = null;
        System.out.println("\n Removing element from index : " + index);
        show();
    }

}
