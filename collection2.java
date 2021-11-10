
package collcetion_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewClass1 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(34);
        list.add(44);
        list.add(7);
        list.add(31);
        list.add(40);
        list.add(99);
        list.add(7);
        System.out.println("Mini Element: "+Collections.min(list));
        System.out.println("Max Element: "+Collections.max(list));
        System.out.println(Collections.frequency(list,7));
        
        
        Collections.sort(list);
        System.out.println(list);
    }
}
