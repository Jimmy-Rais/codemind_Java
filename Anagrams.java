import java.util.Scanner;
public class Anagrams
{
 public static int[] findCharFrequency(String s)
{
  s=s.toLowerCase();
int x[]=new int[26];
for(int i=0;i<s.length();i++)
{
 char ch=s.charAt(i);
 if(ch!=' ')
{
 x[ch-'a']++;
}
}
 return x;
}

public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
String str1,str2;
str1=sc.nextLine();
str2=sc.nextLine();
int m[]=findCharFrequency(str1);
int n[]=findCharFrequency(str2);
for(int i=0;i<26;i++)
{
 if (m[i]!=n[i])
{
 System.out.println("Not Anagrams");
System.exit(0);
}
}
  
 System.out.println("Anagrams");

}
}