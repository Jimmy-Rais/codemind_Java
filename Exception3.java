class Exception3
{
  public static void main(String args[])
{
 try
{
 int x=10/0;
 System.out.println(x);
System.out.println("Task completed");
}
catch(Exception e)
{
 System.out.println("Handling code");
}
 finally
{
 System.out.println("Cleaning code");
}
}
}