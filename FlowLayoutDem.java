import java.awt.*;

class FlowLayoutDem extends Frame{
Label l1;
TextField tf1;
Button b1;
public FlowLayoutDem(){
setLayout(new FlowLayout());
l1=new Label("Username");
tf1=new TextField(25);
b1=new Button("Login");
add(l1);
add(tf1);
add(b1);
}
public static void main(String args[]){

FlowLayoutDem d=new FlowLayoutDem();
d.setTitle("Flow Layout");
d.setSize(200,200);
d.setVisible(true);
}
}