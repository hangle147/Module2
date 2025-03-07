package DSA_List.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addFirst(10);
        list.addLast(20);
        list.add(1, 15);
        list.printList();

        list.remove((Integer) 15);
        list.printList();

        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Contains 20? " + list.contains(20));
        System.out.println("Index of 10: " + list.indexOf(10));
    }
}
