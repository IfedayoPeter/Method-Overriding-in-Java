package methodoverriding;

class MethodOverridingDemo {

	public static void main(String[] args) {

		Bicycle bicycle = new Bicycle(10, 5);
		System.out.println("bicycle speed is " + bicycle.speed);
		System.out.println("bicycle gear is " + bicycle.gear);
		bicycle.applybreaks(1);
		System.out.println("new bicycle speed is " + bicycle.speed);

		MountainBike bike = new MountainBike(10, 10, 5);
		System.out.println("bicycle speed is " + bike.speed);
		System.out.println("bicycle gear is " + bike.gear);
		bike.applybreaks(1);
		System.out.println("new bicycle speed is " + bike.speed);

	}

}
