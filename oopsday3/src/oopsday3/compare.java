package oopsday3;

public class compare {
	
	public static void main(String args[]) {
		 rectangle r1=new rectangle();
		 rectangle r2 =new rectangle();
		 
		 triangle t1=new triangle();
		 triangle t2=new triangle();
		 
		 // comparing primitives 
		 int a=10;
		 int b=35;
		 
		 boolean result = a==b;//are they equal
		 System.out.println(result);
		 
		 //comparing objects
		 //case 1. comparing references
		 //case 2. comparing members
		 
		 result = r1==r2;
		 System.out.println(result);//false
		 
		 result=t1==t2;
		 System.out.println(result);//false
		 
		 //result= r1==t1;
		 //System.out.println(result);// incompatible types
		 
		 rectangle r3=r1;
		 result =r3==r1;
		 System.out.println(result);
		 System.out.println(r1.hashCode());
		 System.out.println(r3.hashCode());
		 System.out.println(r2.hashCode());
		 
		 result=r1.equals(r2);// not ape for primitives
		 System.out.println(result);
		 
		 result= r1.equals(r3);
		 System.out.println(result);
		 
		 r1.setLength(37.5);
		 r2.setBreadth(75.6);
		 
		 r2.setLength(25.97);
		 r2.setBreadth(75.6);
		 
		 if(r1.getBreadth()==r2.getBreadth() && r1.getLength() == r2.getLength())
			 System.out.println("they have the same l nand b");
		 
		 else
			 System.out.println("l abd b are not same ");
		 
		 t1.setS1(35.5);
		 t1.setS2(25.5);
		 t1.setS2(20.3);
		 
		 
		 if(r1.getLength()==t1.getS1())
			 System.out.println("the length and s1 are same");
		 else 
			 System.out.println("the length and s1 are not same");
			 
	}
	
}