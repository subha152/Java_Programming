package newpackage;
import java.util.Scanner;
public class NewClass2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str="";
        System.out.println("Enter any String: ");
        String num=input.nextLine();
        int n=num.length()-1;
        for(int i=n;i>=0;i--){
            str=str+num.charAt(i);
        }
        System.out.println("Reverse of the String: "+str);
    }
}
