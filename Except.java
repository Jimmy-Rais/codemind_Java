class Except{
public static void main(String args[]){
int a=2;
int b=0;
int c;
try{
 c=a/b;
System.out.print(c);
}
catch(ArithmeticException e){
System.out.print("Can't divide a number by zero");
}
finally{
System.out.print("Finally block");
}
}
}