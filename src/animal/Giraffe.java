package animal;

public class Giraffe extends Animal {

	
	double neckLength;
	double height;
	int age;
	
	// Constructors
	
	public Giraffe(int numberOfLegs, String colour, double topSpeed, double neckLength, double height, int age) {
		super(numberOfLegs, colour, topSpeed);
		this.neckLength = neckLength;
		this.height = height;
		this.age = age;
	}
//	Empty constructor
	
	public Giraffe(int numberOfLegs, String colour, double topSpeed) {
		super(numberOfLegs, colour, topSpeed);
	}

//	getters and setters
	public double getNeckLength() {
		return neckLength;
	}

	public void setNeckLength(double neckLength) {
		this.neckLength = neckLength;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
//	Method
	
	public void eat() {
		System.out.println("Trees");
		}
		
	
}
