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
class BikeFactory{
	static Bike getBike(String bikeName) {
		if(bikeName.equals("Duke"))
			return new Duke();
		else if(bikeName.equals("Fz"))
			return new Fz();
		else
		return null;
		
	}
}
public class Factory_Method {
	public static void main(String[] args) {
		Bike b=BikeFactory.getBike("Duke");
		b.cost();
		b.milage();
				
	}

}
