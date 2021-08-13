
package oops;
import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("Enter Number: ");
        num=input.nextInt();
        System.out.println("Factorial: "+fact(num));
        
    }
    static int fact(int num){
        if(num==0){
            return 1;
        }else{
            return num*(num-1);
        }
    }
}
