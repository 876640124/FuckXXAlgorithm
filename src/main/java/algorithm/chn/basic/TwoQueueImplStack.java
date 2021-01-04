package algorithm.chn.basic;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 两个队列实现一个栈
 */
public class TwoQueueImplStack<T> {

    private Queue<T> queue = new LinkedList<T>();
    private Queue<T> help = new LinkedList<T>();

    public void push(T value) {
        queue.offer(value);
    }

    public T peek() {
        while (queue.size() > 1) {
            help.offer(queue.poll());
        }
        T result = queue.peek();
        while (help.size() > 0) {
            queue.offer(help.poll());
        }
        return result;
    }

    public T pop() {
        while (queue.size() > 1) {
            help.offer(queue.poll());
        }
        T result = queue.poll();
        Queue<T> temp = queue;
        queue = help;
        help = queue;
        return result;
    }
}
