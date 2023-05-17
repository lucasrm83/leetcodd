package mergetwolinkedlists;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(list1 != null && list2 != null){
            if(list1.val <list2.val){
                tail.next = list1;
                list1=list1.next;
            }
            else{
                tail.next=list2;
                list2=list2.next;
            }
            //System.out.println(tail.val);
            tail = tail.next;
            //System.out.println(tail.next.val);
        }
        if(list1 != null){
            //Toda vez que tail.next = list1 ou list2 é usado ele aponta para todos os números linkados a ele
            //tambem. se l1 = [1,2,3,4,5] l2 = [2,3,4] se digo tail.next = l1, tail é igual[0,1,2,3,4,5],
            //até que o next seja alterado. linked list é lind0!!!
            tail.next =list1;
        }
        else{
            tail.next=list2;
        }
        return dummy.next;

    }

}