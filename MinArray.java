import java.util.Scanner;
class MinArray
{
public static void main(String args[]) {
int x[],n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
x=new int[n];
for(int i=0;i<n;i++)
 x[i]=sc.nextInt();
int min=Integer.MAX_VALUE;
 for(int i=0;i<n;i++)
{
  if(x[i]<min)
    min=x[i];
}
System.out.println("Minimum value="+min);
}
}