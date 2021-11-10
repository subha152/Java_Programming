
package collcetion_demo;

import java.util.Arrays;

public class NewClass {
    public static void main(String[] args) {
     /*   int[] numbers={1,2,3,4,5,6,7,8,9,10};
        int index=Arrays.binarySearch(numbers, 4);
        System.out.println("The index of element 4 in the array is: "+index);
        */
        
        int[] numbers={10,23,67,13,15,17,78,48,79,91};
        Arrays.sort(numbers);
        
        for(int i:numbers){
            System.out.println(i);
        }
        
        
    }
}
