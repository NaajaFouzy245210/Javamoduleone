package testLambda;
interface Shape
{
	double area();
	double perimeter();
	
}
interface Math{
	double power(int b,int e);
}
interface fact{
	int factorial(int a);
}
public class example1 {

	public static void main(String[] args) 
	{
		fact f = (int a)->
		{
			int facto=1;
			for(int i=1;i<=a;i--)
			{
				facto=facto*i;
			}
			return facto;
			//System.out.println();
		};
		System.out.println(f.factorial(7));
		
	}
		Runnable r1=new Runnable() {
			public void run() {
				System.out.println("from run method");
			}
		};
}	
//		Runnable r =()->{
//			for(int i =1 ;i<=5;i++)
//			{
//				System.out.println("in run method");
//			}
//		};
//		Thread t1=new Thread(r1);
//		t1.start();
//		
//		
//		
//		Math m =(int b, int e)->{
//			int p=1;
//			for(int i=1;i<=e;i++)
//			{
//				p*=b;
//			}
//			return p;
//		};
//			
//			double power=m.power(2, 3);
//			System.out.println(power);
//			
//			
//			Shape s=()->{
//				return 0.0;
//				
//				};
//				double result=s.area();
//				System.out.println(result);
//	
//}
//}
//
