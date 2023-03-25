import java.util.Scanner;
class Swap
{
  public void swap(char ch1,char ch2)
{
   System.out.println("Before swapping");
 System.out.println(ch1+" "+ch2);
  char temp;
  temp=ch1;
 ch1=ch2;
ch2=temp;
 System.out.println("After swaping");
 System.out.println(ch1+" "+ch2);
}
public void swap(float n1,float n2)
{
 System.out.println("Before swapping");
 System.out.println(n1+" "+n2);
  float temp;
  temp=n1;
  n1=n2;
  n2=temp;
 System.out.println("After swaping");
 System.out.println(n1+" "+n2);
}
public void swap(int p,int q)
{
 System.out.println("Before swapping");
 System.out.println(p+" "+q);
  int temp;
  temp=p;
  p=q;
  q=temp;
 System.out.println("After swaping");
 System.out.println(p+"  "+q);
}
}
class Mainclass
{
  public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 Swap o=new Swap();
  char ch1,ch2;
  int p,q;
float n1,n2;
  System.out.print("ch1(char)=");
ch1=sc.nextLine().charAt(0);
System.out.print("ch2(char)=");
ch2=sc.nextLine().charAt(0);
System.out.print("p(int)=");
p=sc.nextInt();
System.out.print("q(int)=");
q=sc.nextInt();
System.out.print("n1(float)=");
n1=sc.nextFloat();
System.out.print("n2(float)=");
n2=sc.nextFloat();
o.swap(ch1,ch2);
o.swap(p,q);
o.swap(n1,n2);

}
}