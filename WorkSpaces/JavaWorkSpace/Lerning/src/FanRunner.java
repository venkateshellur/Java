
public class FanRunner {
	public static void main(String[] args) {
		Fan fan = new Fan("Self Made", 9.89, "Multi Color");
		Fan secondFan = new Fan("Another Made", 5.59, "Single Color");

		fan.TurnOn(true, (byte) 4);

		secondFan.TurnOn(false, (byte) 0);

		System.out.println(fan.getFanState());
		System.out.println(secondFan.getFanState());
	}
}
