
package newpackage;
import java.util.Scanner;
public class ds2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Even Number");
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("Odd Number");
        for(int i=1;i<=100;i++){
            if(i%2!=0){
                System.out.print(i+" ");
                
            }
        }
    }
}
