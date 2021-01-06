package algorithm.chn.leecode;

public class problemOffer06 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(2);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        int[] ints = new problemOffer06().reversePrint(listNode1);
    }

    public int[] reversePrint(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        int length = 0;
        while (head!=null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
            length++;
        }

        int[] result = new int[length];
        int i =0;
        while (pre!=null){
            result[i++] = pre.val;
            pre = pre.next;
        }
        return result;
    }
}
