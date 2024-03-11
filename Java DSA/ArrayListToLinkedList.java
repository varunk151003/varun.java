import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListToLinkedList {
    public static void main(String[] args) {
        // Create an ArrayList
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        // Convert ArrayList to LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer element : arrayList) {
            linkedList.add(element);
        }

        // Print the LinkedList
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
    }
}
