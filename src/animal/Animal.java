package animal;


public class Animal implements Eat {

//	Create 3 variables
	
	int numberOfLegs;
	String colour;
	double topSpeed;
	
//	Constructors
	public Animal(int numberOfLegs, String colour, double topSpeed) {
		super();
		this.numberOfLegs = numberOfLegs;
		this.colour = colour;
		this.topSpeed = topSpeed;
	}
//	empty constructor
	
	public Animal() {
		super();
	}


//	 getters and setters

public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public double getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	
//	toString method
	@Override
	public String toString() {
		return "Animal [numberOfLegs=" + numberOfLegs + ", colour=" + colour + ", topSpeed=" + topSpeed + "]";
	}

	
//	Create 2 methods
	// Mate method
	

	private void hasMate(Animal animal) {
		animal.hasMate(animal);
		}



	//	Mammal method
	private void isMammal(Animal animal) {
		animal.isMammal(animal);
		
    }
	
		
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}	


	
	
	
}
