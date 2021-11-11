package practice1;

public class EncapsulationDemo {
   private int empid;
   private String empname;
   
   public void setEmpid(int emid) {
	   empid=emid;
   }
   public int getEmpid() {
	   return empid;
   }
   
   public void setEmpname(String empname) {
	   this.empname=empname;
   }
   public String getEmpname() {
	   return empname;
   }
}
class Main{
	public static void main(String[] args) {
		EncapsulationDemo obj=new EncapsulationDemo();
		obj.setEmpid(54);
		obj.setEmpname("Subha Ghosh");
		System.out.println(obj.getEmpid());
		System.out.println(obj.getEmpname());
	}
}
