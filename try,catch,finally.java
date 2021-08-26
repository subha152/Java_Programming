
package javaapplication3;
public class Employee {
    public static void main(String[] args) {
        try{
            int a=100,b=0;
            int c=a/b;
            System.out.println(c);
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("I am finally block");
        }
    }
}
