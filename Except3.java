import java.util.*;
class Except3
{
 public static void main(String args[])
{
 int x=0;
  int y=0;
  int z=0;
 Scanner sc=new Scanner(System.in);
  try
  {
   x=sc.nextInt();   //Risky code
   y=sc.nextInt();
   z=x/y;
   }
   catch(Exception e)
    {
   System.out.println("Handling code");
   z=x/2;
    }
  System.out.println(z);
  System.out.println("Task completed");
}
}