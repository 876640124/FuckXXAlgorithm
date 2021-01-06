package algorithm.chn.leecode;

/**
 * @description:
 * @author: ChenHaoNan
 * @create: 2021-01-06
 **/
public class problemOffer24 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (null == head){
            return head;
        }
        ListNode pre = null;
        ListNode next = null;
        while (head.next != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        head.next = pre;
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
    }
}
