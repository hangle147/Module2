package DSA_List.ImplementMethods;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();

        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");

        System.out.println("Danh sách sau khi thêm: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();

        myList.add(2, "E");
        System.out.println("Danh sách sau khi thêm E vào vị trí 2: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();

        myList.remove(1);
        System.out.println("Danh sách sau khi xóa phần tử ở vị trí 1: ");
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();

        System.out.println("Danh sách có chứa phần tử 'C': " + myList.contains("C"));

        System.out.println("Vị trí của phần tử 'C': " + myList.indexOf("C"));

        myList.clear();
        System.out.println("Danh sách sau khi xóa toàn bộ: " + myList.size());
    }
}
