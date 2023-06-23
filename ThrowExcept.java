class ThrowExcept
{
  public static void main(String args[])
{
  try
   {
   method1();
   }
  catch(ArithmeticException ae)
   {
   System.out.println("Don't divide a number with zero");
   }
  System.out.println("Task completed");
}

public static void method1()throws ArithmeticException
{
 int x=10/0;
System.out.println(x);
}
}