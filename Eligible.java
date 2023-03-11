import java.util.Scanner;
class Eligible 
{
public static void main(String args[])
{
 int age;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your age:");
age=sc.nextInt();
 if (age>=18)
{
  System.out.println("You are eligible");
}
 else
{
 System.out.println("You are not eligible,wait for "+(18-age)+"years");
}
}
}