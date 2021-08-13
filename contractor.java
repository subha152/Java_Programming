
package oops;
public class A {
    String name,dept;
    int roll;
    A(int r,String n,String d){
        this.roll=r;
        this.name=n;
        this.dept=d;
       
    }
    A(){
        System.out.println("I am default Contractor");
    }
    void display(){
        System.out.println("Roll: "+roll);
        System.out.println("Name: "+name);
        System.out.println("Department: "+dept);
        System.out.println();
    }
    public static void main(String args[]){
        A obj=new A();
        obj.display();
        A obj1=new A(12,"Subha ","CSE");
        obj1.display();
    }
}
