class MethodOverloading
{
 public int add(int x,int y)
{
  return x+y;
}
 public int add(int x,int y,int z)
{
 return x+y+z;
}
public static void main(String args[])
{
 MethodOverloading m1= new MethodOverloading();
  System.out.println(m1.add(5,7));
}
}