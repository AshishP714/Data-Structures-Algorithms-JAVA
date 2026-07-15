public class ReverseNodesInKGroup {

    static ListNode reverseKGroup(ListNode head, int k) {

        ListNode current = head;
        int count = 0;

        while (current != null && count < k) {
            current = current.next;
            count++;
        }

        if (count == k) {

            current = reverseKGroup(current, k);

            while (count-- > 0) {

                ListNode temp = head.next;
                head.next = current;
                current = head;
                head = temp;
            }

            head = current;
        }

        return head;
    }

    static void print(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = reverseKGroup(head, 2);

        print(head);
    }
}