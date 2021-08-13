
package oops;
import java.util.Scanner;
public class arr {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("How many Number: ");
        num=input.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=input.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=0;i<num;i++){
            if(max<arr[i]){
                max=arr[i];
            }else if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
    }
}
