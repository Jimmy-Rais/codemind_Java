import java.awt.*;
class MyFrame extends Frame
{
 TextField tf1,tf2;
 Label l1,l2;
Button b1;
public MyFrame(){
 tf1=new TextField(20);
 tf2=new TextField(20);
  l1=new Label("User name");
 l2=new Label("Password");
  b1=new Button("Button");
  setLayout(new FlowLayout());
add(l1);
add(tf1);
add(l2);
add(tf2);
add(b1);
}

public static void main(String args[])
{
  MyFrame f1=new MyFrame();
   f1.setTitle("Appdemo");
   f1.setSize(500,500);
   f1.setVisible(true);
}
}