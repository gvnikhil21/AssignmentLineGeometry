package lineComparison;

public class LineComparison {

	public static void main(String[] args) {

		// welcome message
		System.out.println("Welcome to Line Comparison Computation Program!");

		// creates LineComparison object
		LineComparison lineComparison = new LineComparison();

		// creates Point objects
		Point pointOne = new Point();
		Point pointTwo = new Point();
		Point pointThree = new Point();
		Point pointFour = new Point();

		// creates Line objects
		Line lineOne = new Line(pointOne, pointTwo);
		Line lineTwo = new Line(pointThree, pointFour);

		// invoking calculateLength method of Line class
		Integer lengthLineOne = lineOne.calculateLineLength();
		Integer lengthLineTwo = lineTwo.calculateLineLength();

		System.out.println("lengthLineOne\tlengthLineTwo");
		System.out.println("------------------------------");
		System.out.println(lengthLineOne + " units\t\t" + lengthLineTwo + " units");
		System.out.println("------------------------------");

		// Checking the equality of the length of two lines using equals method
		boolean areEqual = lineComparison.equals(lengthLineOne, lengthLineTwo);
		if (areEqual)
			System.out.println("The length of the two lines are equal");
		else
			System.out.println("The length of the two lines are not equal");

		// Checking the equality of the length of two lines using compareTo method
		int value = lineComparison.compareTo(lengthLineOne, lengthLineTwo);
		if (value < 0)
			System.out.println("The length of line one is less than the length of line two");
		else if (value == 0)
			System.out.println("The length of the two lines are equal");
		else
			System.out.println("The length of line one is greater than the length of line two");
	}

	public boolean equals(Integer lengthLineOne, Integer lengthLineTwo) {
		System.out.println("Equals method used!");
		return lengthLineOne.equals(lengthLineTwo);
	}

	public int compareTo(Integer lengthLineOne, Integer lengthLineTwo) {
		System.out.println("CompareTo method used!");
		return lengthLineOne.compareTo(lengthLineTwo);
	}
}

class Point {
	private double xCoordinate;
	private double yCoordinate;

	// constructor
	public Point() {
		this.xCoordinate = Math.floor(Math.random() * 10) + 1;
		this.yCoordinate = Math.floor(Math.random() * 10) + 1;
	}

	// getters and setters
	public double getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public double getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
}

class Line {
	private Point pointOne;
	private Point pointTwo;

	// constructor
	public Line(Point one, Point two) {
		this.pointOne = one;
		this.pointTwo = two;
	}

	// getters and setters
	public Point getPointOne() {
		return pointOne;
	}

	public void setPointOne(Point pointOne) {
		this.pointOne = pointOne;
	}

	public Point getPointTwo() {
		return pointTwo;
	}

	public void setPointTwo(Point pointTwo) {
		this.pointTwo = pointTwo;
	}

	public int calculateLineLength() {
		// storing pointOne coordinates in x1 and y1
		double x1 = pointOne.getxCoordinate();
		double y1 = pointOne.getyCoordinate();

		// storing pointTwo coordinates in x2 and y2
		double x2 = pointTwo.getxCoordinate();
		double y2 = pointTwo.getyCoordinate();

		// computing length
		int length = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		return length;
	}
}
