
package tttt;

import java.util.Stack;

public class Stack_P {
    public static void main(String[] args) {
        
        Stack<Integer>stack=new Stack<>();
        stack.push(23);
        stack.push(56);
        stack.push(78);
        stack.push(77);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
    }
}
