package methodoverriding;

class Bicycle {

	protected int speed;
	protected int gear;

	public Bicycle(int startspeed, int startgear) {
		speed = startspeed;
		gear = startgear;
	}

	public void changegear(int increment, int decrement) {
		gear += increment;
		gear -= decrement;
	}

	public void speedup(int increment) {
		speed += increment;
	}

	public void applybreaks(int decrement) {
		speed -= decrement;
	}

}
