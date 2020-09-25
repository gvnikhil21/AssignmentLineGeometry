package lineComparison;

public class LineComparison {

	public static void main(String[] args) {
		// variables
		// pointOne random x-y coordinates between 0 to 10
		double x1LineOne = Math.floor(Math.random() * 10) + 1;
		double y1LineOne = Math.floor(Math.random() * 10) + 1;
		double x1LineTwo = Math.floor(Math.random() * 10) + 1;
		double y1LineTwo = Math.floor(Math.random() * 10) + 1;
		// pointTwo random x-y coordinates between 0 to 10
		double x2LineOne = Math.floor(Math.random() * 10) + 1;
		double y2LineOne = Math.floor(Math.random() * 10) + 1;
		double x2LineTwo = Math.floor(Math.random() * 10) + 1;
		double y2LineTwo = Math.floor(Math.random() * 10) + 1;

		// welcome message
		System.out.println("Welcome to Line Comparison Computation Program!");
		System.out.println("lengthLineOne\tlengthLineTwo");
		System.out.println("---------------------------");

		// calculation of length of the line from pointOne to pointTwo
		Integer lengthLineOne = (int) Math
				.sqrt(Math.pow(x2LineOne - x1LineOne, 2) + Math.pow(y2LineOne - y1LineOne, 2));
		Integer lengthLineTwo = (int) Math
				.sqrt(Math.pow(x2LineTwo - x1LineTwo, 2) + Math.pow(y2LineTwo - y1LineTwo, 2));
		System.out.println(lengthLineOne + " units\t\t" + lengthLineTwo + " units");
		System.out.println("---------------------------");

		// Checking the equality of the length of two lines using compareTo method
		int value = lengthLineOne.compareTo(lengthLineTwo);
		if (value < 0)
			System.out.println("The length of line one is less than the length of line two");
		else if (value == 0)
			System.out.println("The length of the two lines are equal");
		else
			System.out.println("The length of line one is greater than the length of line two");
	}

}
