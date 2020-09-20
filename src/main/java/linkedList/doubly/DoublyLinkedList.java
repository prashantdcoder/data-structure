package linkedList.doubly;

import linkedList.List;

public class DoublyLinkedList implements List {

    private Node head;

    private void setHead(Node node) {
        this.head = node;
    }

    private Node getHead() {
        return this.head;
    }

    @Override
    public void add(int value) {
        Node current = getHead();
        Node node = new Node(value);
        if (current == null) {
            setHead(node);
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
            node.previous = current;
        }
        System.out.println("\n inserting element at end");
        show();
    }

    @Override
    public void show() {
        Node headStart = getHead();
        if (headStart == null) {
            System.out.println(" List is empty");
        } else {
            while (headStart != null) {
                System.out.print("[" + headStart.value + "]");
                headStart = headStart.next;
            }
        }
    }

    public void addAtStart(int value) {
        Node current = getHead();
        Node node = new Node(value);
        if (current == null) {
            setHead(node);
        } else {
            node.next = current;
            current.previous = node;
            setHead(node);
        }
        System.out.println("\n inserting at start");
        show();
    }

    @Override
    public int size() {
        Node current = getHead();
        int count = 1;
        if (current == null) {
            count = 0;
        } else {
            while (current.next != null) {
                count++;
                current = current.next;
            }
        }
        return count;
    }

    @Override
    public void addAtIndex(int index, int value) throws IndexOutOfBoundsException {
        Node current = getHead();
        int size = size() - 1;

        if (index > size) {
            throw new IndexOutOfBoundsException("Cannot insert at index");
        } else if (current == null) {
            add(value);
        } else if (index == 0) {
            addAtStart(value);
        } else {
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            System.out.println("Current is : " + current.value);
            Node node = new Node(value);
            node.next = current.next;
            current.next = node;
            node.previous = current;
        }
        System.out.println("\n inserting element at index : " + index);
        show();
    }

    @Override
    public void removeFromStart() throws IndexOutOfBoundsException {
        Node current = getHead();
        int size = size();
        if (current == null) {
            throw new IndexOutOfBoundsException("Cannot remove from empty list");
        } else if (size == 1) {
            current.next = null;
            current.previous = null;
            setHead(null);
        } else {
            Node next = current.next;
            current.next = null;
            next.previous = null;
            setHead(next);
        }
        System.out.println("\n removing from start");
        show();
    }

    @Override
    public void removeFromEnd() {

    }

    @Override
    public void removeFromIndex(int index) {

    }
}
