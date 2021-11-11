
package exam;
public class CopyConstractor {
    int id;
    String name;
    CopyConstractor(int i,String n){
        id=i;
        name=n;
    }
    CopyConstractor(CopyConstractor cp){
        id=cp.id;
        name=cp.name;
    }
    void display(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
    }
    public static void main(String[] args) {
        CopyConstractor obj=new CopyConstractor(1,"Subha");
        CopyConstractor obj1=new CopyConstractor(obj);
        obj.display();
        obj1.id=2;
        obj1.name="Rabi";
        obj1.display();
    }
}