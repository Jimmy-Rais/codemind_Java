import java.util.*;
class ExceptHandling 
{
 public static void main(String args[])
{
 int a=10,b=0;
int c;
int d[]={1,2,3};
try
{
System.out.println(d[10]);
c=a/b;
System.out.println("c="+c);
}
catch(ArithmeticException e)
{
System.out.println(e);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(e);
}

}

}