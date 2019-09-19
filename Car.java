
public class Car extends Vehicle{
	// heritage de la classe vehicule
	
	public Car(String brand, int kilometers) {
		super(brand, kilometers);
	}
	
	// implementation de la methode abstract
	@Override
	public String doStuff() {
		return "vroum vroum !";
	}

	
	
}
