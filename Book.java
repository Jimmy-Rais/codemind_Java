import java.util.Scanner;
class Book {
   String title;
   String author;
   int no_pages;
   float price;
 Scanner sc=new Scanner(System.in);
public void getBookInfo()
{
 System.out.println("Enter the Book title,author,pages and price");
title=sc.nextLine();
author=sc.nextLine();
no_pages=sc.nextInt();
price=sc.nextFloat();
}
public void showBookInfo() {
System.out.println("Book title ="+title);
System.out.println("Book title="+author);
System.out.println("No of pages="+no_pages);
System.out.println("Price="+price);
}
public static void main(String args[])
{
  Book b1=new Book();
b1.title="Java programming";
b1.author="JimmyRais";
b1.no_pages=350;
b1.price=450.0f;
b1.showBookInfo();
System.out.println("============================");
Book b2=new Book();
b2.getBookInfo();
b2.showBookInfo();
}
}