import java.util.Scanner;
class MaxArrayMeth
{
 public static int findMaximum(int arr[])
{
    int max=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++)
 {
     if(arr[i]>max)
      {
      max=arr[i];
      }
 }
return max;
}
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
int x[],n;
 System.out.print("Size of the array(n)=");
  n=sc.nextInt();
  x=new int[n];
for(int i=0;i<n;i++)
{
 System.out.println("Element"+(i+1)+"=");
 x[i]=sc.nextInt();
}
 int max=MaxArrayMeth.findMaximum(x);
System.out.println("Computing.......");
System.out.println("The maximum value is:"+max);
}

}