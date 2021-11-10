
package tttt;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_P {
    public static void main(String[] args) {
        Queue<Integer>queue=new LinkedList<>();
        queue.offer(23);
        queue.offer(80);
        queue.offer(33);
        queue.offer(48);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
