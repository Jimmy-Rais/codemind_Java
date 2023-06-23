import java.util.*;
public class Anagrams2
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
String str1,str2;
str1=sc.nextLine();
str2=sc.nextLine();
char ch1[]=str1.toCharArray();
char ch2[]=str2.toCharArray();
Arrays.sort(ch1);
Arrays.sort(ch2);
if(Arrays.equals(ch1,ch2))
System.out.println("Anagrams");
else
System.out.println("Not Anagrams");

}
} 