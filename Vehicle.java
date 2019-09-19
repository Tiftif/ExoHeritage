
public abstract class Vehicle {

	//attributs
	String brand;
	int kilometers;
	
	//constructeurs
	public Vehicle(String brand, int kilometers) {
		super();
		this.brand = brand;
		this.kilometers = kilometers;
	}

	// accesseurs et mutateurs
	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getKilometers() {
		return kilometers;
	}


	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}
	
	//methode abstract
	public abstract String doStuff();
	
}
