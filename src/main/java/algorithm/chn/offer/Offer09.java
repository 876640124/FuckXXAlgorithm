package algorithm.chn.offer;

import java.util.Stack;

public class Offer09 {
    class CQueue {
        Stack<Integer> push = new Stack<>();
        Stack<Integer> pop = new Stack<>();

        public CQueue() {

        }

        public void appendTail(int value) {
            push.push(value);
        }

        public int deleteHead() {
            if (pop.size() == 0) {
                while (!push.isEmpty()) {
                    pop.push(push.pop());
                }
            }
            return pop.isEmpty() ? -1 : pop.pop();
        }
    }

    public static void main(String[] args) {

    }
}
