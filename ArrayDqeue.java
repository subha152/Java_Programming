
package tttt;

import java.util.ArrayDeque;

public class ArrayDeque_P {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrdp=new  ArrayDeque<>();
        arrdp.offer(23);
        arrdp.offerFirst(20);
        arrdp.offerLast(35);
        arrdp.offer(26);
        System.out.println(arrdp);
        System.out.println(arrdp.peek());
        System.out.println(arrdp.peekFirst());
        System.out.println(arrdp.peekLast());
        System.out.println(arrdp.poll());
        System.out.println(arrdp.pollFirst());
        System.out.println(arrdp.pollLast());
    }
}