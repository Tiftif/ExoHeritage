
public class Boat extends Vehicle{
	
	// heritage de la classe vehicule
	public Boat(String brand, int kilometers) {
		super(brand, kilometers);
		
	}

	// implementation de la methode abstract
	@Override
	public String doStuff() {
		return "glou glou !";
	}
	
	
}
