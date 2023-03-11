package oopsday3;

public class MathImp implements Math {
	
	//private int n;
	//private int m;

	@Override
	public int factorial(int n) {
		// TODO Auto-generated method stub
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact= fact*i;
		}
		return fact ;
	}

	@Override
	public int add(int n, int m) {
		// TODO Auto-generated method stub
		int s=n+m;
		return s;
	}

	@Override
	public int sub(int n, int m) {
		// TODO Auto-generated method stub
		int q=n-m;
		return q;
	}

	@Override
	public int mul(int n, int m) {
		// TODO Auto-generated method stub
		int w=n*m;
		return w;
	}

	@Override
	public int div(int n, int m) {
		// TODO Auto-generated method stub
		int e=n/m;
		return e;
	}

	@Override
	public void oddoreven(int n) {
		// TODO Auto-generated method stub
		if(n%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}

	//public int getA() {
		//return n;
	//}

	//public void setA(int a) {
		//this.n = n;
	//}

	//public int getB() {
		//return m;
	//}

	//public void setB(int b) {
		//this.m = m;
	//

}
