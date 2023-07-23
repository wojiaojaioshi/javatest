//import java.util.Stack;
//
//public class 用栈来实现一个队列 {
//    Stack<Integer>stack1,stack2;
//    public MyQueue() {
//        stack1=new Stack<>();
//        stack2=new Stack<>();
//    }
//
//    public void push(int x) {
//        stack1.push(x);
//    }
//
//    public int pop() {
//        if(stack2.isEmpty())
//        {
//            while (!stack1.isEmpty())
//            {
//                stack2.push(stack1.pop());
//            }
//            return stack2.pop();
//        }
//        else {
//            return stack2.pop();
//        }
//
//    }
//
//    public int peek() {
//        if(stack2.isEmpty())
//        {
//            while (!stack1.isEmpty())
//            {
//                stack2.push(stack1.pop());
//            }
//            return stack2.peek();
//        }
//        else {
//            return stack2.peek();
//        }
//    }
//
//    public boolean empty() {
//        if (stack1.isEmpty()&&stack2.isEmpty())return true;
//        else return false;
//    }
//}
