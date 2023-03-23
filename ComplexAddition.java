import java.util.Scanner;
class ComplexAddition 
{
  int real,img;
Scanner sc=new Scanner(System.in);
public ComplexAddition()
{
  real=1;
  img=1;
}
 public void getInput()
 {
  real=sc.nextInt();
  img=sc.nextInt(); 
 }
public void showComplex()
{
 System.out.println(real+"+i"+img);
}
public ComplexAddition addition(ComplexAddition c)
{
   ComplexAddition temp=new ComplexAddition();
   temp.real=this.real+c.real;
   temp.img=this.img+c.img;
  return temp;
}
public static void main(String args[])
{
  ComplexAddition c1=new ComplexAddition();
  ComplexAddition c2=new ComplexAddition();
  c1.getInput();
  c2.getInput();
  c1.showComplex();
  c2.showComplex();
  ComplexAddition c3=c1.addition(c2);
  c3.showComplex();
}
}