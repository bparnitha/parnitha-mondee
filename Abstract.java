abstract class Bike{
	abstract void cost();
	abstract void milage();
}
class Duke extends Bike{
	void cost() {
		System.out.println("duke details: ");
		System.out.println(" cost is 2lakh");
	}
	void milage() {
		System.out.println("milage is 200km");
	}
}
class Fz extends Bike{
	void cost() {
		System.out.println("fz details: ");
		System.out.println("cost is 5lakhs");
	}
	void milage() {
		System.out.println("milage is 300km");
	}
}
public class Abstract {
	public static void main(String[] args) {
		Duke d=new Duke();
		d.cost();
		d.milage();
		Fz f=new Fz();
		f.cost();
		f.milage();
}
}
