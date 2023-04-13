class Parent
{
 public void show()
 {
  System.out.println("Parent properties");
 }
}
class Child extends Parent
{
 public void display()
 {
 System.out.println("Child properties");
}
}
class SingleLevelInheritance
{
 public static void main(String args[])
{
  Parent p=new Parent();
  p.show();
Child c=new Child();
c.show();
c.display();
}
}