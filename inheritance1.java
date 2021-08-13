
package oops;
public class B {
    void display(){
        System.out.println("I am B");
    }
    
    public class A extends B{
        @Override
        void display(){
            System.out.println("I am A");
        }
    }
    
    public static void main(String[] args) {
        B obj=new B();
        obj.display();
        
        
    }
    
}
