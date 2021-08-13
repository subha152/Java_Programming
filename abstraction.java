package oops;
public abstract class inter {
    public abstract void display();
    
}
public class C extends inter{
    @Override
    public  void display(){
        System.out.println("I am C");
    }
}
public class output {
    public static void main(String[] args) {
        inter obj;
        obj=new C();
        obj.display();
    }
}