package oopsday4.statictest;

public class StaticDemo2 {
	static int a;
	static void method()
	{
		System.out.println("from method"+a);
		//method() is not static
	}
	public void method2()
	{
		System.out.println(a);
		method();
	}

}
