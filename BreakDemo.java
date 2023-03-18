import java.util.Scanner;
class BreakDemo{
public static void main(String args[])
{
  int x[]={20,30,40,50,60,70};
  int key;
  int flag=0;
Scanner input=new Scanner(System.in);
System.out.print("Key:");
key=input.nextInt();
 for(int i=0;i<x.length;i++)
  {
  if (key==x[i])
{
 System.out.print("Element found at index "+i);
flag=1;
break;
}
}
 if(flag==0)
{
 System.out.print("Element not found");
}
}
}