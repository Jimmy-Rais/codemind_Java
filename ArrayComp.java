import java.util.*;
class ArrayComp
{
public static void ArrayComp(int a[])
{
    int count=0;
 for(int i= 0;i<a.length;i++)
 {
     for(int j=0;j<a.length;j++)
     {
         if((a[j]<a[i])&& (j!=i))
          {
              count++;
          }
    
     }
  System.out.print(count);
 }
  
}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
     n=sc.nextInt();
    int[] a = new int[n];
       for(int i=0;i<n;i++)
           {
       a[i]=sc.nextInt();
        }
        ArrayComp(a);
    }
}