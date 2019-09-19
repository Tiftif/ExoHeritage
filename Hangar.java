
public class Hangar {

	public static void main(String[] args) {

		// Instances de la classe Boat & Car
		Car clio = new Car("Clio", 77000);
		Boat titanic = new Boat("Titanic", 220000);

		// print
		System.out.println("Je suis " + clio.getBrand() + " et je fais " + clio.doStuff());
		System.out.println("Je suis " + titanic.getBrand() + " et je fais " + titanic.doStuff());

	}

}
