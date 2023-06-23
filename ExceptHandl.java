class ExceptHandl
{
 public static void main(String args[])
{
 int x,y,z;
try
 {
  x=Integer.parseInt(args[0]);
  y=Integer.parseInt(args[1]);
  z=x/y;
  }
catch(ArithmeticException ae)
{
  System.out.println("y value should be non zero element");
 }
catch(ArrayIndexOutofBoundsException aoe)
{
System.out.println("Minimum 2 inputs required");
}
 catch(NumberFormatException ne)
{
 System.out.println("Input values should be integers only");
}
catch(Exception e)
{
 System.out.println("Other type of exception");
}
System.out.println(z);
System.out.println("task completed");
}
}