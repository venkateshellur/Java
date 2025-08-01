
public class Fan {
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;

	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	public String getFanState() {
		return String.format(
				"This fan is from company - %s with radius of - %f clored -%s has the speed -%d  is turned - %b", make,
				radius, color, speed, isOn);
	}

	public void changeSpeed(byte speed) {
		if (speed <= 0) {
			this.isOn = false;
		}
		this.speed = speed;
	}

	public void TurnOn(boolean isTurnedOn, byte speed) {
		this.isOn = isTurnedOn;
		this.speed = !isTurnedOn ? 0 : speed;
	}

}
