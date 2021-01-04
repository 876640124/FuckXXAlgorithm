package algorithm.chn.basic;

import java.util.Stack;

/**
 * 两个栈实现一个队列
 */
public class TwoStackImplQueue {
    private Stack<Integer> push = new Stack<Integer>();
    private Stack<Integer> pop = new Stack<Integer>();

    public TwoStackImplQueue() {
    }

    private void pushToPop(){
        if (pop.isEmpty()){
            while (!push.isEmpty()){
                pop.push(push.pop());
            }
        }
    }

    public void push(int value){
        push.push(value);
        pushToPop();
    }

    public int peek(){
        if (pop.isEmpty()&&push.isEmpty()){
            throw new RuntimeException("无数据");
        }
        pushToPop();
        return pop.peek();
    }

    public int pop(){
        if (pop.isEmpty()&&push.isEmpty()){
            throw new RuntimeException("无数据");
        }
        pushToPop();
        return pop.pop();
    }
}
