package algorithm.chn.leecode;

import java.util.PriorityQueue;

public class problem1046 {
    public static void main(String[] args) {
        problem1046 problem1046 = new problem1046();
        problem1046.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1});
    }

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> b - a);
        for (int stone : stones) {
            pq.offer(stone);
        }

        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            if (a > b) {
                pq.offer(a - b);
            }
        }
        return pq.isEmpty()?0:pq.poll();
    }

    public void insertSort() {

    }
}
