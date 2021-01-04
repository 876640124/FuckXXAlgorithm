package algorithm.chn.basic;

/**
 * 数组实现队列
 */
public class ArrayImplQueue {

    private int[] arr = null;

    private int size = 0;
    private int maxValue = 0;
    private int begin = 0;
    private int end = 0;

    private int nextIndex(int p) {
        return p == maxValue - 1 ? 0 : ++p;
    }

    public ArrayImplQueue(int maxValue) {
        this.maxValue = maxValue;
        this.arr = new int[maxValue];
    }

    public int pop() {
        int res;
        if (size > 0){
            res = arr[begin];
            begin = nextIndex(begin);
            size--;
        }else{
            throw new RuntimeException("Queue size is null");
        }
        return res;
    }


    public int peek(){
        int res;
        if (size > 0){
            res = arr[begin];
            begin = nextIndex(begin);
        }else{
            throw new RuntimeException("Queue size is null");
        }
        return res;
    }

    public void push(int value) {
        if (size < maxValue) {
            arr[end] = value;
            end = nextIndex(end);
            size++;
        } else {
            throw new RuntimeException("Queue outofbounds size:" + (size + 1));
        }
    }

    public static void main(String[] args) {
        ArrayImplQueue arrayImplQueue = new ArrayImplQueue(5);
        arrayImplQueue.push(1);
        arrayImplQueue.push(2);
        arrayImplQueue.push(3);
        arrayImplQueue.push(4);
        System.out.println(arrayImplQueue.pop());
        arrayImplQueue.push(5);
        arrayImplQueue.push(6);
        System.out.println(arrayImplQueue.pop());
        System.out.println(arrayImplQueue.pop());
        System.out.println(arrayImplQueue.pop());
        System.out.println(arrayImplQueue.pop());
        System.out.println(arrayImplQueue.pop());
    }
}
