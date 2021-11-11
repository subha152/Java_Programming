
package exam;
public class ThrowDemo {
    int a=12;
    int b=5;
    void divide(){
        if(b==5){
            throw new ArithmeticException("Can not divided by 5");
        }else{
            int res=a/b;
            System.out.println(res);
        }
    }
    public static void main(String[] args) {
        ThrowDemo obj=new ThrowDemo();
        
        try{
            obj.divide();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
