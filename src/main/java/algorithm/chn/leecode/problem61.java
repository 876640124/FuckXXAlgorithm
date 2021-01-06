package algorithm.chn.leecode;

/**
 * @description:
 * @author: ChenHaoNan
 * @create: 2021-01-06
 **/
public class problem61 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null){
            return head;
        }
        int length = 1;
        ListNode curr = head;
        while (curr.next!=null){
            curr = curr.next;
            length++;
        }

        // 链表成环
        curr.next = head;
        // 计算出第几个节点为尾部节点
        int new_tail = length - k%length-1;

        //找到尾部节点
        int count = 0;
        while (count != new_tail){
            head =head.next;
            count++;
        }
        ListNode tail = head;
        head = head.next;
        tail.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(0);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(2);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        ListNode listNode = rotateRight(listNode1, 4);
    }
}
