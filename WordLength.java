import java.util.Scanner;
public class WordLength
{
 public static void findNumberOfWords(String s)
{
  String words[]=s.split(" ");
  for(int i=0;i<words.length;i++)
{
  System.out.println(words[i]+" "+words[i].length());
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