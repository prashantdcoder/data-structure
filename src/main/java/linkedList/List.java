package linkedList;

public interface List {

    void add(int value);

    void show();

    int size();

    void addAtIndex(int index, int value);

    void removeFromStart();

    void removeFromEnd();

    void removeFromIndex(int index);

}
