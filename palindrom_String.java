
package oops;
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name;
        System.out.println("Enter any Number: ");
        name=input.nextLine();
        StringBuffer s1=new StringBuffer(name);
        String sb=s1.reverse().toString();
        if(name.equals(sb)){
            System.out.println("Palindrom Number");
        }else{
            System.out.println("Not a Palindrom Number");
        }
    }
}
