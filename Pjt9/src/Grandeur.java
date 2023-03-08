
public class Grandeur {

	public String color;
	public String gear;
	public int price;
	
	public Grandeur() {
		System.out.println("Grandeur constructor");
	}
	public void run() {
		System.out.println(" -- run() --");
	}
	public void stop() {
		System.out.println("--stop()--");
	
	}
		
	public void info() {
		System.out.println("-- info() --");
		System.out.println("color : " + color);
		System.out.println("price : " + price);
	}
	
}
