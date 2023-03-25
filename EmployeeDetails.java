import java.util.Scanner;
class EmployeeDetails
{
 int empid;
String ename;
double sal;
static int count=0;
static String companyName="Tecnical Hub";
Scanner sc=new Scanner(System.in);
public EmployeeDetails(int empid,String ename,double sal)
{
  this.empid=empid;
  this.ename=ename;
this.sal=sal;
EmployeeDetails.count=EmployeeDetails.count+1;
}
public void displayEmployee()
{
 System.out.println(empid+" "+ename+" "+sal+" "+EmployeeDetails.companyName);
}
public void showCount()
{
 System.out.println("Total objects= "+EmployeeDetails.count);
}
}
class StaticDemo
{
public static void main(String args[])
{
 EmployeeDetails e1=new EmployeeDetails(101,"Jim",4500);
 EmployeeDetails e2=new EmployeeDetails(102,"Jordan",5500);
e1.displayEmployee();
e2.displayEmployee();
e1.showCount();
EmployeeDetails e3=new EmployeeDetails(103,"Jack",7800);
e3.showCount();
}
}