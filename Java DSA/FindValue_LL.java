class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class FindValue_LL {
    public static ListNode findValue(ListNode head, int target) {
        ListNode current = head;
        while (current != null) {
            if (current.val == target) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public static void main(String[] args) {
        // Create a linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Find a value
        int target = 10;
        ListNode node = findValue(head, target);

        if (node != null) {
            System.out.println("Found value " + target);
        } else {
            System.out.println("Value " + target + " not found");
        }
    }
}
