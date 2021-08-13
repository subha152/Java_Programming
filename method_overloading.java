package oops;
public class A {
    void add(int a,int b){
        System.out.println("Sum: "+(a+b));
    }
    void add(double a,double b,double c){
        System.out.println("Sum: "+(a+b+c));
    }
    void add(){
        System.out.println("Default Constract");
    }
    void add(int a,int b,int c){
        System.out.println("Sum: "+(a+b+c));
    }
    
    public static void main(String args[]){
         A obj=new A();
         obj.add(10,30);
         obj.add(10.8,3.9,99.6);
         obj.add(7,9,23);
         obj.add();
    }
}
