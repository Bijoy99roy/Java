import java.applet.*;
import java.awt.*;
public class Firstapplet extends Applet{
TextField text;
		public void paint(Graphics g){
			String s;
			s=text.getText();
			g.drawString("Enter your name :",20,20);
			g.drawString("Your Entered name is:",10,50);
			g.drawString(s,140,50);
		}
public void init(){
			text=new TextField(10);
			add(text);
		}
		public void start(){
			System.out.println("***start***");
		}
		public void stop(){
			System.out.println("***Stop***");
		}
		public void destroy(){
			System.out.println("***Destroy***");
		}
		public boolean action(Event event,Object obj){
			repaint();
			return true;
		}
}
