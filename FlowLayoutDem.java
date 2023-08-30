import java.awt.*;

class FlowLayoutDem extends Frame{
Label l1;
TextField tf1;
Button b1;
CheckboxGroup cbg=new CheckboxGroup();
Checkbox ch1,ch2;
public FlowLayoutDem(){
setLayout(new FlowLayout());
l1=new Label("Username");
tf1=new TextField(25);
b1=new Button("Login");
ch1=new Checkbox("Java",cbg,true);
ch2=new Checkbox("C",cbg,false);
add(l1);
add(tf1);
add(b1);
add(ch1);
add(ch2);

}
public static void main(String args[]){

FlowLayoutDem d=new FlowLayoutDem();
d.setTitle("Flow Layout");
d.setSize(200,200);
d.setVisible(true);
}
}