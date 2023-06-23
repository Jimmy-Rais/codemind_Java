class Except1
{
  public static void main(String args[])
{
  int x[]={10,20,30};
for(int i=0;i<=x.length;i++) //ArrayIndexOutOfBoundsException
   System.out.println(x[i]);
System.out.println("Task completed"); 
}
}