
package javaapplication3;
import  java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,count=1;
        System.out.println("Enter number: ");
        num=input.nextInt();
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<num;j++){
                if(i==j || i+j==num-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
