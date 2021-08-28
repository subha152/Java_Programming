
package javaapplication3;
import java.util.Scanner;
public class NewClass3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*
        String a;
        System.out.print("String: ");
        a=input.nextLine();
        StringBuffer sb=new StringBuffer(a);
        String b=sb.reverse().toString(); 
        
        System.out.println("reverse String: "+b);
        
        
        if(a.equals(b)){
            System.out.println("Palindrom Number");
        }else{
            System.out.println("Not a Palindrom Number");
        }
        */
        
      

        String a;
        System.out.print("String: ");
        a=input.nextLine();
        String rev="";
        for(int i=a.length()-1;i>=0;i--){
           rev=rev+a.charAt(i);
        }
        System.out.println("Reverse of the Number: "+rev);
        if(a.equals(rev)){
          System.out.println("Palindrom String");
        }else{
           System.out.println("Not a Palindrom String ");
        }
    }
}
