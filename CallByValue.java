import java.util.Scanner;
class CallByValue
{
 public static void increment(int arr[],double y)
{
  for(int i=0;i<n;i++)
  {
   arr[i]+=1;
    y+=1;
  }
 }
 public static void main(String args[])
{
 int x[],n;
double pi=3.142;
 n=sc.nextInt();
x=new int[n];
for(int i=0;i<n;i++)
  {
  x[i]=sc.nextInt();
  }
 System.out.println("Before calling the increment");
 for(int i=0;i<n;i++)
  {
  System.out.println(x[i]);
  }
System.out.println("After calling the increment");
 for(int i=0;i<n;i++)
  {
  System.out.println(CallByValue.increment);
  }
}
}