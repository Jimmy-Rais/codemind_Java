import java.util.Scanner;
public class FrequencyOfChar
{
 public static void findNumberOfWords(String s)
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
for(int i=0;i<26;i++)
{
 if(x[i]!=0)
System.out.println((char)(i+97)+" - "+x[i]);
}
}

public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  String str;
  str=sc.nextLine();
  findNumberOfWords(str);

}
}