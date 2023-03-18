import java.util.Scanner;
class Employee{
  String name;
  double sal;
  long mobile;
  String email;
Scanner sc=new Scanner(System.in);
public void getInfo()
{
 System.out.print("Employee name:");
 name=sc.nextLine();
 System.out.print("Employee salary:");
 sal=sc.nextDouble();
sc.nextLine();
System.out.print("Employee mobile:");
 mobile=sc.nextLong();
sc.nextLine();
System.out.print("Employee mail:");
email=sc.nextLine();	
}
public void showInfo()
{
 System.out.println("Employee name:"+name);
 System.out.println("Employee salary:"+sal);
 System.out.println("Employee mobile:"+mobile);
 System.out.println("Employee mail:"+email);
}
public static void main(String args[])
{
  Employee b=new Employee();
  b.getInfo();
  b.showInfo();
}
}