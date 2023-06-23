import java.awt.*;
class ChoiceDemo extends Frame
{
 Choice ch1;
Checkbox c1,c2;
public ChoiceDemo()
{
setLayout(new FlowLayout());
  c1=new Checkbox("Cricket",true);
c2=new Checkbox("Football");
ch1=new Choice();
ch1.add("Windows");
ch1.add("Linux");
ch1.add("Unix");
add(c1);
add(c2);
add(ch1); 
}
public static void main(String args[])
{
 ChoiceDemo c=new ChoiceDemo();
  c.setSize(300,300);
c.setTitle("Checkbox");
c.setVisible(true);
}
}