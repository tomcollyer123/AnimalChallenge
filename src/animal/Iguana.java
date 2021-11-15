package animal;

public class Iguana extends Animal implements Swim{

	double tongueLength;
	String scaleTexture;
	boolean canTheyClimbTrees;
	
	
//	Constructors
	
	public Iguana(int numberOfLegs, String colour, double topSpeed, double tongueLength, String scaleTexture,
			boolean canTheySwim) {
		super(numberOfLegs, colour, topSpeed);
		this.tongueLength = tongueLength;
		this.scaleTexture = scaleTexture;
		this.canTheyClimbTrees = canTheySwim;
	}


// Empty constructors

	public Iguana(int numberOfLegs, String colour, double topSpeed) {
		super(numberOfLegs, colour, topSpeed);
	}

// getters and setters
	
	public double getTongueLength() {
		return tongueLength;
	}


	public void setTongueLength(double tongueLength) {
		this.tongueLength = tongueLength;
	}


	public String getScaleTexture() {
		return scaleTexture;
	}


	public void setScaleTexture(String scaleTexture) {
		this.scaleTexture = scaleTexture;
	}


	public boolean isCanTheySwim() {
		return canTheyClimbTrees;
	}


	public void setCanTheySwim(boolean canTheySwim) {
		this.canTheyClimbTrees = canTheySwim;
	}
	
//	Method
	
	public void eat() {
		System.out.println("Plants");
		}
		
	public void swim() {
		System.out.println("Yes");
	}
}
