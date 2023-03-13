import java.util.Scanner;
class TriangleType
{
  public static void main(String args[])
{
 int a,b,c;
 Scanner input=new Scanner(System.in);
 System.out.println("Enter the first side:");
 a=input.nextInt();
System.out.println("Enter the second side:");
b=input.nextInt();
System.out.println("Enter the third side:");
c=input.nextInt();
if(a==b && b==c)
{
 System.out.println("The Given Triangle is equilateral");
}
else if(a==b || b==c || a==c)
{
   System.out.println("The given triangle is Isoscele");
}
else if( a!=b && b!=c && a!=c)
{
 System.out.println("The given triangle is scalene");
}
input.close();
}
}