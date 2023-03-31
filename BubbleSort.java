import java.util.Scanner;
class BubbleSort
{
 public static void bubbleSort(int arr[],int size)
{
  for(int i=0;i<size-1;i++)
 {
  for(int j=0;j<size-i-1;j++)
  {
  if(arr[j]>arr[j+1])
    {
int temp=arr[j];
  arr[j]=arr[j+1];
 arr[j+1]=temp;
    }
  }
 }
}
 public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
int n,x[],i;
System.out.println("Value of n=");
n=sc.nextInt();
x=new int[n];
for(i=0;i<n;i++)
{
  System.out.println("Element "+(i+1)+"=");
  x[i]=sc.nextInt();
}
 System.out.println("Before Sorting");
for(i=0;i<n;i++)
{
  System.out.println(x[i]);
}
bubbleSort(x,n);
System.out.println("After Sorting...");
for(i=0;i<n;i++)
{
 System.out.println(x[i]);
}
}
}

