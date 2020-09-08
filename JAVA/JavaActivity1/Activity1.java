package JavaActivity1;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car sedan = new Car();
		sedan.make = 2014;
		sedan.color = "Black";
		sedan.transmission = "Manual";
		sedan.displayCharacteristics();
		sedan.accelerate();
		sedan.brake();
	}

}
