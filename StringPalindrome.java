import java.util.*;

public class StringPalindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String s1="";
        for(int i=0;i<A.length();i++)
        {
            s1=A.charAt(i)+s1;
        }
        if(s1.equals(A))
          System.out.println("Yes");
        else
          System.out.println("No");
          sc.close();
        
    }
}