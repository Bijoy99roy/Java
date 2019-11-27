import javax.swing.*;  
import java.awt.*;

public class Firstswing {  
public static void main(String[] args) {  
 JFrame jf=new JFrame(" My Window");
JButton b=new JButton("Hello");
b.setBounds(23,50,100,56);
jf.add(b);
jf.setSize(200,200);
jf.setLayout(null);
jf.setVisible(true);
}  
}
