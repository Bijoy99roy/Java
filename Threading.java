
class MultiDemo extends Thread
{
	public void run()
	{
		System.out.println("Hello babe");
	}
}
public class Threading {

	public static void main(String[] args) {
		
		MultiDemo obj = new MultiDemo();
		obj.start();
	}

}
