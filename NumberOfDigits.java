import java.util.Scanner;
class NumberOfDigits{
public static void main(String args[]){
 Scanner input=new Scanner(System.in);
 System.out.print("n:");
int n=input.nextInt();
 int digits=(int)Math.log10(n)+1;
System.out.print("Number of digits="+digits);
}
}