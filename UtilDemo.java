import java.util.*;
class UtilDemo
{
 public static void main(String args[])
{
 int x[]={10,30,22,90,100};
System.out.println("Before sorting:");
for(int i=0;i<x.length;i++)
   System.out.print(x[i]+" ");
Arrays.sort(x);
System.out.println("\nAfter Sorting:");
for(int i=0;i<x.length;i++)
 System.out.println(x[i]+" ");
}
}