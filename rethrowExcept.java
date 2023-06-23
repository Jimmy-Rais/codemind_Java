class rethrowExcept
{
 public static void main(String args[])
 {
 int x[]={1,2,3}; 
  try   //Outer Try block
  {
 System.out.println(x[1]);
       try 
       {
       int z=x[2]/0;
       System.out.println(z);
       }
       catch(ArithmeticException ae)
        {
     System.out.println("Inner Try:Don't divide a number by zero");
      throw ae;
        }
    }
 catch(ArrayIndexOutOfBoundsException aoe)
   {
  System.out.println("Index out of range problem");
   }
 catch(ArithmeticException ae)
   {
System.out.println("Outer try:Don't divide a number by zero");
   }
  catch(Exception e)
  {
System.out.println("Other exceptions raised");
  }
 System.out.println("Task completed");
 }
}