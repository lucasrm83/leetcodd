package mergetwolinkedlists;

public class MergeLists {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);
        l1.next.next.next = new ListNode(7);
        l1.next.next.next.next = new ListNode(8);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);
        ListNode result = new ListNode();
        result = result.mergeTwoLists(l1,l2);

        printList(result);


    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.print("null");
    }

}
