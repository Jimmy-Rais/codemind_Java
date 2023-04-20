import java.awt.*;
import javax.swing.*;

public class MyGUI extends JFrame {

    public MyGUI() {
        setTitle("My GUI Application");
        setLayout(new FlowLayout());
        
        JLabel label = new JLabel("Enter your name:");
        JTextField textField = new JTextField(20);
        JButton button = new JButton("Submit");
        
        add(label);
        add(textField);
        add(button);
        
        setSize(300, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        MyGUI gui = new MyGUI();
    }

}
