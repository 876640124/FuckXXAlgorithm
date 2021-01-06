package algorithm.chn.leecode;

/**
 * @description:
 * @author: ChenHaoNan
 * @create: 2021-01-06
 **/
public class problem445 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 若其中一个链表为空则返回非空的链表
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        }

        l1 = reverseList(l1);
        l2 = reverseList(l2);
        boolean carry = false;
        int tmp = l1.val + l2.val;
        carry = tmp > 9 ? true : false;
        ListNode head = new ListNode(tmp % 10);
        l1 = l1.next;
        l2 = l2.next;
        ListNode curr =head;
        while (l1 != null && l2 != null) {
            int a = carry ? 1 : 0;
            tmp = l1.val + l2.val + a;
            carry = tmp > 9 ? true : false;
            curr.next = new ListNode(tmp % 10);
            curr = curr.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int a = carry ? 1 : 0;
            tmp = l1.val+a;
            carry = tmp > 9 ? true : false;
            curr.next = new ListNode(tmp % 10);
            curr = curr.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            int a = carry ? 1 : 0;
            tmp = l2.val+a;
            carry = tmp > 9 ? true : false;
            curr.next = new ListNode(tmp % 10);
            curr = curr.next;
            l2 = l2.next;
        }
        if (carry){
            curr.next = new ListNode(1);
        }
        return reverseList(head);
    }

    public static ListNode reverseList(ListNode head) {
        if (null == head) {
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

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
