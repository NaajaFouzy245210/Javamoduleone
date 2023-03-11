package oopsday1.setget;

public class Carfactory {

	public static void main(String[] args) 
	
	{
		Car jag= new Car("yellow,9745636,"innova","toyota");
		
		
		/*jag.setColor("red");
		jag.setPrice(89765);
		jag.setBrand("susuki")************/
		// TODO Auto-generated method stub
				System.out.println(jag.hashCode());
				
		/* * Car naaja= new Car(); naaja.setcolor="black"; naaja.setbrand="ferrari";
		 * naaja.setmodel="laferrari"; naaja.setprice=323456;
		 * 
		 * System.out.println(naaja.brand); System.out.println(naaja.color);
		 * System.out.println(naaja.model); System.out.println(naaja.price);*/
		 
		System.out.println(jag);
		Car bmw=new Car();
		bmw.setColor="white";
		bmw.setBrand=("bmw");4
		bmw.setModel=("z.series");
		bmw.setPrice=543678;
		
		System.out.println(bmw.brand);
		System.out.println(bmw.color);
		System.out.println(bmw.model);
		System.out.println(bmw.price);
		
		

	}

}
