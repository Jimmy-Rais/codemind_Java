import java.util.Scanner;
class Meth
{
 public static void main(String args[])
{
 Scanner input=new Scanner(System.in);
System.out.print("Value of n= ");
int n=input.nextInt();  
 System.out.print("n is "+Odd(n)); 
}
 public static String  Odd(int n)
{
 if(n%2!=0)
return "Odd";
 else
  return "Even";
 
}
}