 import java.util.Scanner;
class Vowel
{
 public static void main(String args[])
 {
  char ch;
  Scanner input=new Scanner(System.in);
  System.out.println("Enter a character:");
  ch=input.nextLine().charAt(0);
  switch(ch)
 {
   case 'a':
   case 'e':
   case 'i':
   case 'o':
   case 'u':
   case 'A':
   case 'E':
   case 'I':
   case 'O':
   case 'U':
   System.out.println("Vowel");
   break;
   default:
   System.out.println("Consonnant");
   break;
 } 
 input.close();
 }
 }