
package oops;
import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int arr[]={1,2,3,5,6};
        int n=arr.length+1;
        int sum_of_natural_number=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
             sum=sum+arr[i];
        }        
        int missing=sum_of_natural_number-sum;
        System.out.println("Missing number: "+missing);
        
    }
}
