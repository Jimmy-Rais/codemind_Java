import java.util.Scanner;
class ValidTriangle 
{
 public static void main(String args[])
{
 Scanner input=new Scanner(System.in);
 int a,b,c;
System.out.println("a=");
a=input.nextInt();
System.out.println("b=");
b=input.nextInt();
System.out.println("c=");
c=input.nextInt();
 if(a+b>c)
{
 System.out.println("Valid Triangle");
}
else if (a+c > b)
{
 System.out.println("Valid Triangle");
}
else if (b+c > a)
{
 System.out.println("Valid Triangle");
}
else
{
System.out.println("Invalid Triangle");
}
}
}