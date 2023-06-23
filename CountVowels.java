import java.util.Scanner;
public class CountVowels
{
 public static int findNumberOfWords(String s)
{
  int count=0;
  int p=0;
  int i;
  for(i=0;i<s.length();i++)
  {
      if(s.charAt(i)==' ')
      {
    count++;
      }
    }
  return count+1;
}

public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  String str;
  str=sc.nextLine();
  System.out.println(findNumberOfWords(str));

}
}