
package oops;
import java.util.Scanner;
public class B {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,temp,r,sum=0;
        System.out.println("Enter Number: ");
        num=input.nextInt();
                
        temp=num;
        while(temp!=0){
            r=temp%10;
            sum=sum+r*r*r;
            temp=temp/10;
        }
        if(num==sum){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not a Armstrong Number");
        }
    }
}
