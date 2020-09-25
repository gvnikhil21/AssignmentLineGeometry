package lineComparison;

public class LineComparison {

	public static void main(String[] args) {
		// variables
		// pointOne random x-y coordinates between 0 to 10
		double x1 = Math.floor(Math.random() * 10) + 1;
		double y1 = Math.floor(Math.random() * 10) + 1;
		// pointTwo random x-y coordinates between 0 to 10
		double x2 = Math.floor(Math.random() * 10) + 1;
		double y2 = Math.floor(Math.random() * 10) + 1;
		// length of line
		int length = 0;

		// welcome message
		System.out.println("Welcome to Line Comparison Computation Program!");

		System.out.println("x1\ty1\tx2\ty2");
		System.out.println("---------------------------");
		System.out.println(x1 + "\t" + y1 + "\t" + x2 + "\t" + y2);
		System.out.println("---------------------------");
		// calculation of length of the line from pointOne to pointTwo
		length = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Length of the line is " + length + " units");
	}

}
