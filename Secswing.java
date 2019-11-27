import javax.swing.*;  
import java.awt.*;
public class Secswing{  
public static void main(String[] args) {  
JFrame jf=new JFrame(" My Window");
jf.setLayout(new FlowLayout());
	JLabel jl = new JLabel("Name : ");
	jf.add(jl);
	JTextField jtf = new JTextField(20);
	jf.add(jtf);
JLabel jl1 = new JLabel("Year : ");
jf.add(jl1);
String year[] = {"2017","2018","2019","2020","2021"};
JComboBox jc = new JComboBox(year);
jf.add(jc);
JLabel jl2 = new JLabel("Dept : ");
jf.add(jl2);
String dept[] = {"CSE","ECE","CE","ME","EE"};
JComboBox jc1 = new JComboBox(dept);
jf.add(jc1);

JButton b=new JButton("Submit");
b.setBounds(23,100,100,56);
jf.add(b);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setSize(500,500);
jf.setVisible(true);
}  
}
