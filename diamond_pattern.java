
package newpackage;
import java.util.Scanner;
public class NewClass1 {
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("Enter any Number: ");
        num=input.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=num;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=num;k>=i;k--){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
