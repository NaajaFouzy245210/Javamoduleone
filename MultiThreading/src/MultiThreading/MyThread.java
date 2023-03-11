package MultiThreading;

public class MyThread extends Thread {
	private String name;
	
	public MyThread(String string) {
		// TODO Auto-generated constructor stub
	}
	public void MyThread(String name)
	{
		this.name=name;
	}
	public void run()
	{
		for(int i=1;i<600;i++)
		{
			System.out.println(name +"="+i);
		}
	}
}
