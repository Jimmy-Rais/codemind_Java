import java.util.Scanner;
class Print4Multiples
{

 public static int printNumbers(int n)
{
 for(int i=4;i<=n;i=i+4)
  return i;
}

 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("n=");
 int n=sc.nextInt();
 int a=printNumbers(n);
System.out.println(a+"");
}
}