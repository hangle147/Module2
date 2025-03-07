package DSA_List.LinkedList;

public class MyLinkedList<E> {
    private Node<E> head;
    private int numNodes;

    private static class Node<E> {
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public MyLinkedList() {
        head = null;
        numNodes = 0;
    }

    public void add(int index, E element) {
        if (index < 0 || index > numNodes) throw new IndexOutOfBoundsException();
        Node<E> newNode = new Node<>(element);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        numNodes++;
    }

    public void addFirst(E e) {
        add(0, e);
    }

    public void addLast(E e) {
        add(numNodes, e);
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) throw new IndexOutOfBoundsException();
        Node<E> removedNode;
        if (index == 0) {
            removedNode = head;
            head = head.next;
        } else {
            Node<E> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            removedNode = current.next;
            current.next = removedNode.next;
        }
        numNodes--;
        return removedNode.data;
    }

    public boolean remove(Object e) {
        if (head == null) return false;
        if (head.data.equals(e)) {
            head = head.next;
            numNodes--;
            return true;
        }
        Node<E> current = head;
        while (current.next != null) {
            if (current.next.data.equals(e)) {
                current.next = current.next.next;
                numNodes--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public E get(int index) {
        if (index < 0 || index >= numNodes) throw new IndexOutOfBoundsException();
        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public E getFirst() {
        return get(0);
    }

    public E getLast() {
        return get(numNodes - 1);
    }

    public int size() {
        return numNodes;
    }

    public void clear() {
        head = null;
        numNodes = 0;
    }

    public boolean contains(E o) {
        Node<E> current = head;
        while (current != null) {
            if (current.data.equals(o)) return true;
            current = current.next;
        }
        return false;
    }

    public int indexOf(E o) {
        Node<E> current = head;
        int index = 0;
        while (current != null) {
            if (current.data.equals(o)) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public void printList() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
