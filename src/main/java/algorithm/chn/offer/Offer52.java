package algorithm.chn.offer;

public class Offer52 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == headB) {
            return headA;
        }
        if (headA == null || headB == null) {
            return null;
        }

        ListNode cur1 = headA;
        ListNode cur2 = headB;

        int n = 0;
        while (cur1.next != null) {
            cur1 = cur1.next;
            n++;
        }

        while (cur2.next != null) {
            cur2 = cur2.next;
            n--;
        }

        if (cur1 != cur2) {
            return null;
        }

        cur1 = n > 0 ? headA : headB;
        cur2 = cur1 == headB ? headA : headB;

        n = Math.abs(n);

        while (n>0){
            cur1 = cur1.next;
            n--;
        }

        while (cur1 != cur2){
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        return cur1;
    }

    public static void main(String[] args) {

    }
}
