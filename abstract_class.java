abstract class Animal
{
  public abstract void sound();
  public abstract void eat();
  public void run()
  {
   System.out.println("Running....");
  }
}
class Dog extends Animal
{
 public void sound()
  {
   System.out.println("Bow bow...");
  }
public void eat()
  {
  System.out.println("Vegetables + meat...");
}
public void guard()
{
 System.out.println("Protect the owner");
} 
}
class Tiger extends Animal
{
 public void sound()
 {
  System.out.println("Roar...");
}
public void eat()
{
  System.out.println("Meat");
}
public void attack()
{
 System.out.println("attack other animals");
}
}
class MainClass
{
public static void main(String args[])
{
 Dog d=new Dog();
 d.sound();
 d.eat();
 d.guard();
 Tiger t=new Tiger();
  t.sound();
  t.eat();
  t.attack();
}
}