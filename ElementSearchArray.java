import java.util.Scanner;
class ElementSearchArray
{
 public static int elementSearch(int key,int arr[])
 {
    for(int i=0;i<arr.length;i++)
    {
     if(key==arr[i])
      return i;
   }
   return -1;
 }
 public static void main(String args [])
 {
   int x[],n,k;
   Scanner sc=new Scanner(System.in);
   System.out.print("Size of the array(n)=");
   n=sc.nextInt();
x=new int[n];
   System.out.print("Key=");
   k=sc.nextInt();
  for(int i=0;i<n;i++)
  { 
    System.out.print("Element"+(i+1)+"=");
     x[i]=sc.nextInt();
  }
 int res=ElementSearchArray.elementSearch(k,x);
System.out.println("Computing....");
 if (res==-1)
  {
  System.out.print("The element does not exist");
}
 else
  {
 System.out.print("Element exist at index "+res);
}
 }

 }