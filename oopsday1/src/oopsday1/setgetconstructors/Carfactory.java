package oopsday1.setgetconstructors;

public class Carfactory {

	public static void main(String[] args) 
	
	{
		
		Car jag=new Car();
		jag.setColor("red");
		jag.setPrice(89765);
		jag.setBrand("susuki");
		jag.setModel("natik");
		
		// TODO Auto-generated method stub
	/*
		 * Car naaja= new Car(); naaja.setcolor="black"; naaja.setbrand="ferrari";
		 * naaja.setmodel="laferrari"; naaja.setprice=323456;
		 * 
		 * System.out.println(naaja.brand); System.out.println(naaja.color);
		 * System.out.println(naaja.model); System.out.println(naaja.price);
		 */
		
		
		
		System.out.println(jag.hashCode());
		System.out.println(Integer.toHexString(jag.hashCode()));
		System.out.println(jag);
		
		System.out.println(jag.getColor());
		System.out.println(jag.getPrice());
		System.out.println(jag.getBrand());
		System.out.println(jag.getModel());
		
		Car bmw=new Car();
		
		System.out.println(bmw.hashCode());
		System.out.println(Integer.toHexString(bmw.hashCode()));
		System.out.println(bmw);
		
//		bmw.setColor="white";
//		bmw.setBrand=("bmw");
//		bmw.setModel=("z.series");
//		bmw.setPrice=543678;
		
		System.out.println(bmw.getColor());
		System.out.println(bmw.getPrice());
		System.out.println(bmw.getBrand());
		System.out.println(bmw.getModel());
		
		

	}

}
