import java.util.Scanner;
class MaxArray
{
public static void main(String args[])
{
 int x[],n;
 Scanner sc=new Scanner(System.in);
 System.out.print("Size of the array(n)=");
 n=sc.nextInt();
 x=new int[n];
  for(int i=0;i<n;i++)
   {
    System.out.print("Element"+(i+1)+"=");
     x[i]=sc.nextInt();
   }
  int max=Integer.MIN_VALUE;
  for(int i=0;i<n;i++)
    {
    if(x[i]>max)
     {
     max=x[i];
     }
    }
System.out.println("Computing..........");
  System.out.println("The Maximum value="+max);
}
}