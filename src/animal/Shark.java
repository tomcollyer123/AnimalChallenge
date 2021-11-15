package animal;

public class Shark extends Animal implements Swim {

	int numberOfTeeth;
	double finSize;
	String sharkType;

	
	
//	Constructors
	
	public Shark(int numberOfLegs, String colour, double topSpeed, int numberOfTeeth, double finSize,
			String sharkType) {
		super(numberOfLegs, colour, topSpeed);
		this.numberOfTeeth = numberOfTeeth;
		this.finSize = finSize;
		this.sharkType = sharkType;
	}

	
//	 getters and setters

public Shark(int numberOfLegs, String colour, double topSpeed) {
	super(numberOfLegs, colour, topSpeed);
}



public int getNumberOfTeeth() {
	return numberOfTeeth;
}



public void setNumberOfTeeth(int numberOfTeeth) {
	this.numberOfTeeth = numberOfTeeth;
}



public double getFinSize() {
	return finSize;
}



public void setFinSize(double finSize) {
	this.finSize = finSize;
}



public String getSharkType() {
	return sharkType;
}



public void setSharkType(String sharkType) {
	this.sharkType = sharkType;
}

	
//Method

public void eat() {
	System.out.println("Anything");
	}
	
public void swim() {
	System.out.println("Yes");
	
}

}
