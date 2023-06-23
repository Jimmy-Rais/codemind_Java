import java.util.*;
class TooYoungException extends Exception
{
 public TooYoungException()
 {
 super();
  }
public TooYoungException(String msg)
 {
 super(msg);
 }
}
class TooOldException extends Exception
{
 public TooOldException()
  {
   super();
  }
 public TooOldException(String msg)
 {
  super(msg);
 }
}
class UserDefExc
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int age;
  try
   {
 age=sc.nextInt();
if (age<18)
   throw new TooYoungException("You are too young and not eligible");
else if (age>40)
  throw new TooOldException("You are too old and not eligible");
 else
System.out.println("You are eligible");
   }
catch(TooYoungException tye) 
 {
 System.out.println(tye);
 }
catch(TooOldException toe)
 {
  System.out.println(toe);
 }
catch(InputMismatchException ime)
{
 System.out.println("Incorect age format");
}
catch(Exception e)
{
 System.out.println("Other type of error");
}
}
}