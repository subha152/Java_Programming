public interface D {
    public abstract void display();
}
public class E implements D{
   @Override
   public void display(){
        System.out.println("I am Interface");
    }
}
public class G {
    public static void main(String[] args) {
        D obj;
        obj=new E();
        obj.display();
    }
}