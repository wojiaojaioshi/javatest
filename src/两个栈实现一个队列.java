import java.util.Stack;

public class 两个栈实现一个队列 {
    class CQueue {
        Stack<Integer>stack1,stack2;
        public CQueue() {
            stack1=new Stack<>();
            stack2=new Stack<>();
        }

        public void appendTail(int value) {
            stack1.add(value);
        }

        public int deleteHead() {
            if(stack2.isEmpty())
            {
                while (!stack1.isEmpty())
                {
                    stack2.add(stack1.pop());
                }
                return stack2.pop();
            }
            else {
                return stack2.pop();
            }

        }
    }
}
