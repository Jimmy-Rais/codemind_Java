import java.util.Scanner;
class A
{
 int x;
 Scanner sc=new Scanner(System.in);
public void getX()
{
 x=sc.nextInt();
}
public void showX()
{
 System.out.println("x= "+x);
}
}
class B extends A 
{
 int y;
public void getY()
{
 y=sc.nextInt();
}
public void showY()
{
 System.out.println("y= "+y);
}
}
class C extends B
{
 int z;
public void getZ()
{
 z=sc.nextInt();
}
public void showZ()
{
 System.out.println("z= "+z);
}
}
class MultiLevelInheritance
{
 public static void main(String args[])
 {
  C a=new C();
  a.getX();
  a.getY();
 a.getZ();
a.showX();
 a.showY();
  a.showZ();
 }
}