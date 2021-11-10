
package tttt;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_P {
    public static void main(String[] args) {
        System.out.println("-----------------------------------HashSet-----------------------------------------");
        Set<Integer> set=new HashSet<>();
        set.add(32);
        set.add(29);
        set.add(55);
        set.add(7);
        set.add(9);
        System.out.println(set);
        set.remove(9);
        System.out.println(set);
        System.out.println(set.contains(7));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
        
        System.out.println("-----------------------------------LinkedHashSet-----------------------------------------");
        
        //-----------------------------------LinkedHashSet-----------------------------------------
        Set<Integer> set1=new LinkedHashSet<>();
        set1.add(32);
        set1.add(29);
        set1.add(55);
        set1.add(7);
        set1.add(9);
        System.out.println(set1);
        set1.remove(9);
        System.out.println(set1);
        System.out.println(set1.contains(7));
        System.out.println(set1.isEmpty());
        System.out.println(set1.size());
        set1.clear();
        System.out.println(set1);
        
        //-----------------------------------TreeSet-----------------------------------------
        System.out.println("-----------------------------------TreeSet-----------------------------------------");
        Set<Integer> set2=new TreeSet<>();
        set2.add(32);
        set2.add(29);
        set2.add(55);
        set2.add(7);
        set2.add(9);
        System.out.println(set2);
        set2.remove(9);
        System.out.println(set2);
        System.out.println(set2.contains(7));
        System.out.println(set2.isEmpty());
        System.out.println(set2.size());
        set2.clear();
        System.out.println(set2);
    }
}
