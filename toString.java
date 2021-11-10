package javaapplication1;
public class Practice {
    int id;
    String name,dept;
    Practice(int id,String name,String dept){
        this.id=id;
        this.name=name;
        this.dept=dept;
    }
    @Override
    public String toString(){
        return "Id: "+this.id+"\n"+"Name: "+this.name+"\n"+"Department: "+this.dept;
    }
}
class Main1{
    public static void main(String[] args) {
        Practice p1=new Practice(1,"Subha Ghosh","CSE");
        System.out.println(p1);
    }
}