import java.awt.*;
class GridDemo extends Frame
{
  Button b1,b2,b3,b4;
public GridDemo()
{
 setLayout(new GridLayout(2,2,1,1));
b1=new Button("1");
b2=new Button("2");
b3=new Button("3");
b4=new Button("4");
add(b1);
add(b2);
add(b3);
add(b4);
}
public static void main(String args[])
{
 GridDemo d=new GridDemo();
 d.setVisible(true);
 d.setSize(300,300);
 d.setTitle("Grid");
}
}