package oopsday2;

public class Carfactory2 {
	
	public static void main(String args[]) {
		
		//CarIface car;//not referring to any object
		CarIface car =new Car(5000,500,0,false);
		
		car.start();
		car.hone();
		car.move();
		car.stop();
		System.out.println(car);
		
	}

}
