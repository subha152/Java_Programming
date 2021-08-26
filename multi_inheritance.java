package javaapplication3;
public interface A {
    void display();
}
public interface B {
    void display();
}
public class C implements B,A{
    @Override
    public void display(){
        System.out.println("This is A and B");
    }
}
public class output {
    public static void main(String[] args) {
        C obj=new C();
        obj.display();
    }
}
