package oopsday1;

public class Carfactory {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Car naaja= new Car();
		naaja.color="black";
		naaja.brand="ferrari";
		naaja.model="laferrari";
		naaja.price=323456;
		
		System.out.println(naaja.brand);
		System.out.println(naaja.color);
		System.out.println(naaja.model);
		System.out.println(naaja.price);
		
		Car bmw=new Car();
		bmw.color="white";
		bmw.brand=("bmw");
		bmw.model=("z.series");
		bmw.price=543678;
		
		System.out.println(bmw.brand);
		System.out.println(bmw.color);
		System.out.println(bmw.model);
		System.out.println(bmw.price);
		
		

	}

}
