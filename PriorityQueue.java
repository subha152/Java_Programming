
package tttt;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue_P {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(      );
        pq.offer(89);
        pq.offer(67);
        pq.offer(87);
        pq.offer(99);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
