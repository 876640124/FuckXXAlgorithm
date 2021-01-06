package algorithm.chn.leecode;

/**
 * @description:
 * @author: ChenHaoNan
 * @create: 2021-01-06
 **/
public class problem1290 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head!=null){
            sb.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(sb.toString(),2);
    }

    public int getDecimalValue2(ListNode head) {
        int sum = 0;
        while (head != null) {
            sum = (sum << 1) + head.val;
            head = head.next;
        }
        return sum;
    }
}
