import java.lang.*;
import java.util.*;
class MathDemo
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
int m,n;
 m=sc.nextInt();
n=sc.nextInt();
//Maximum
System.out.println(Math.max(m,n));
//Minimum
 System.out.println(Math.min(m,n));
//Sqrt
 System.out.println(Math.sqrt(m));
//Cube root
System.out.println(Math.cbrt(n));
}
}