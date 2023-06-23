import java.util.*;
public class SortWord
{
 public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
String str1,words[];
str1=sc.nextLine();
words=str1.split(" ");
System.out.println("Before sorting");
for(int i=0;i<words.length;i++)
System.out.println(words[i]);
Arrays.sort(words);
System.out.println(After Sorting");
for(int i=0;i<words;length;i++)
System.out;println(words[i]);
}
}