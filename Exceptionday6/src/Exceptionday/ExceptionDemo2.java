package Exceptionday;

public class ExceptionDemo2 {
	public static void main(String[] args)
	{
	try{
		System.out.println("program started");
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=b/a+a*b;
		String name=args[2];
		int  data[]= {a,b};
	}catch(ArithmeticException e)
	{
		e.printStackTrace();
	}
	catch(NumberFormatException e)
	{
		e.printStackTrace();
		
	}catch (Exception e)
	{
		e.printStackTrace();
	}
	
	System.out.println("program completed");

}
}
