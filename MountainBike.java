package methodoverriding;

public class MountainBike extends Bicycle {

	public int seatheight;

	public MountainBike(int startheight, int startspeed, int startgear) {
		super(startspeed, startgear);
		seatheight = startheight;
	}

	public void setheight(int newvalue) {
		seatheight = newvalue;
	}

	@Override
	public void speedup(int increment) {
		speed += increment + 5;
	}

	@Override
	public void applybreaks(int decrement) {
		speed -= decrement + 5;
	}

}
