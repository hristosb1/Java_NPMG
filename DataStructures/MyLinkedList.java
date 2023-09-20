package DataStructures;

public class MyLinkedList<T> {
    Node<T> first;
    Node<T> last;
    int size;

    public static void main(String[] args) {
        MyLinkedList<Integer> l = new MyLinkedList<>();
        l.add(1);
        l.add(2);
        System.out.println(l.first.value);
        l.add(0, 0);
        System.out.println(l.first.value);
        System.out.println(l.first.next.value);
    }

    public void add(T e) {
        Node<T> newNode = new Node<>();
        newNode.value = e;
        if (size == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            Node<T> temp = last;
            last = newNode;
            last.previous = temp;
        }
        size++;
    }
    public void add(T e, int index) {
        Node<T> newNode = new Node<>();
        newNode.value = e;
        if (index == 0) {
            Node<T> temp = first;
            first = newNode;
            first.next = temp;
            temp.previous = first;
        }
    }
};
