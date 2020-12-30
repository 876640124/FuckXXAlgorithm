package algorithm.chn.leecode;



public class problem237 {
    class ListNode {
        int val;
        algorithm.chn.leecode.ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {

    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
