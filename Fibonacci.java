import java.util.Scanner;
class Fibonacci
{
 public static void fib(int n)
{
 int a=0,b=1,c;
 System.out.print(a+" "+b+" ");
 c=a+b;
 while(c<=n)
 {
 System.out.print(c+" ");
  a=b;
  b=c;
  c=a+b;
}
}
public static void main(String args[]) {
 Scanner sc=new Scanner(System.in);
 System.out.print("n=");
 int n=sc.nextInt();
 fib(n);
}
}