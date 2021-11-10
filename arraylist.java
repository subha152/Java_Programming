
package tttt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class NewClass {
    public static void main(String[] args) {
        
        List<Integer>list=new ArrayList<>();
        list.add(123);
        list.add(45);
        list.add(90);
        list.add(80);
        list.add(1,88);
        System.out.println(list);
        for(int value:list){
            System.out.println(value);
        }
        Iterator<Integer>it=list.iterator();
        while(it.hasNext()){
            System.out.println("Iterator: "+it.next());
        }
        
        /*
        
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(39);
        list1.add(900);
        list1.add(55);
        list1.add(43);
        list1.add(32);
        System.out.println(list1);
       
        
        
        list.addAll(list1);
        System.out.println(list);
        System.out.println(list.get(1));
         */       
    }
}