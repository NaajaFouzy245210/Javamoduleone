package oopsday4.polymorphism;

public class Testshapes {
	public static void main(String[] args) {
		shape s =new Rectangle(10.25,65.75);
		double result=s.area();
		System.out.println(result);
		
		s=new Circle(65.75);
		result=s.area();
		System.out.println(result);
		
		s=new Square(55);
		result=s.area();
		System.out.println(result);
	}

}
