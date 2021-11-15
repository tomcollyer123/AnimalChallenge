package animal;

public class Lion extends Animal {

	String gender;
	String lionBreed;
	int pawSize;
	
//	Constructors
	
	public Lion(int numberOfLegs, String colour, double topSpeed, String gender, String lionBreed, int pawSize) {
		super(numberOfLegs, colour, topSpeed);
		this.gender = gender;
		this.lionBreed = lionBreed;
		this.pawSize = pawSize;
	}
	
//	empty constructors
	
	public Lion(int numberOfLegs, String colour, double topSpeed) {
		super(numberOfLegs, colour, topSpeed);
	}

//	getters and setters
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLionBreed() {
		return lionBreed;
	}

	public void setLionBreed(String lionBreed) {
		this.lionBreed = lionBreed;
	}

	public int getpawSize() {
		return pawSize;
	}

	public void setFood(int pawSize) {
		this.pawSize = pawSize;
	}
	
//	Mehtods
	
	public void eat() {
	System.out.println("Gazelle");
	}

}
