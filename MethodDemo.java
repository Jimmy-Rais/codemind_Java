import java.util.Scanner;
class MethodDemo
{
 public static String wish(int time)
{
  if(time<12)
return "Good morning";
 else if(time <=16)
return "Good Afternoon";
  else 
  return "Good evening";
}  
 
public static void main(String args[])
 {
 Scanner input=new Scanner(System.in);
System.out.println("Time:");
 int time=input.nextInt(); 
 String msg=wish(time);
System.out.println("Hi Jim "+msg); 
input.close();
 }
 
 }