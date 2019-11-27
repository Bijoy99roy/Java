import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class SwingDemo
{
    public static void main(String args[])
    {
        JFrame jf = new JFrame("My Window");
        jf.setLayout(new FlowLayout());
        JLabel jl = new JLabel("Name");
        jf.add(jl);
        JTextField jtf1 = new JTextField(20);
        
        jf.add(jtf1);
        JLabel jl1 = new JLabel("Dept");
        jf.add(jl1);
        String deptarr[] = {"Cse", "Ece", "Cv", "Me", "Ee"};
        JComboBox jcb = new JComboBox(deptarr);
        
        jf.add(jcb);
        JButton jb = new JButton("Ok");

        jb.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            String value=jtf1.getText();
            String valuec = jcb.getSelectedItem().toString();
            JFrame page=new JFrame("new");
            String arr[] = {value, valuec};
            for(int i =0;i < 2; i++){
            JLabel jll = new JLabel(arr[i]);
            page.add(jll);
            }
            page.setSize(500,500);
            page.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            page.setVisible(true);
            }
        });
        jf.add(jb);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500,500);
        jf.setVisible(true);   
    }
}