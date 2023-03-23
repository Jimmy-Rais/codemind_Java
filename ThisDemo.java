class Test
{
 int x;
public Test(int x)
{
  this.x=x;
}
public void show()
{
 System.out.println("x="+this.x);
}
public static void main (String args[])
{
 Test t1=new Test(10);
 t1.show();
 Test t2=new Test(20);
  t2.show();
}
}