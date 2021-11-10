
package map_demo;

import java.util.HashMap;
import java.util.Map;

public class HashMap_P {
    public static void main(String[] args) {
        Map<String,Integer> numbers=new HashMap<>();
        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
        numbers.put("Four",4);
 
        System.out.println(numbers);
        System.out.println(numbers.isEmpty());
        
        for(Map.Entry<String,Integer> e:numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println("------------------------------------------------------");
        for(String key:numbers.keySet()){
            System.out.println(key);
        }
         System.out.println("------------------------------------------------------");
        for(Integer value:numbers.values()){
            System.out.println(value);
        }
        numbers.clear();
        System.out.println(numbers);
    }
}
