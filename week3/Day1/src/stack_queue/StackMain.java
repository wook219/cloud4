package stack_queue;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Buy candy");
        stack.push("Sell juice");
        stack.push("Sleep");
        stack.push("Sleep");

        System.out.println(stack.size());

        while(stack.contains("Sleep")){
            System.out.println(stack.peek());
            stack.pop();
        }
        System.out.println(stack.size());
    }
}
