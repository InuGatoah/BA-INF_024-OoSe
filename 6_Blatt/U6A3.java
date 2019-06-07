import java.util.Scanner;

class NumberTooBigException extends RuntimeException {

	/**
	 * Wird gebraucht für Serialisierung. Wir implementieren es nur, um den Compiler
	 * zum Schweigen zu bringen.
	 */

	 private static final long serialVersionUID = 1L;
	
	public NumberTooBigException() {
		super("Die Nummer ist zu groß.");
	}

}




class NumberTooSmallException extends Exception {

	/**
	 * Wird gebraucht für Serialisierung. Wir implementieren es nur, um den Compiler
	 * zum Schweigen zu bringen.
	 */

	 private static final long serialVersionUID = 1L;

	public NumberTooSmallException() {
		super("Die Nummer ist zu klein.");
	}

}





public class U6A3 {

	public static void main(String[] args) throws NumberTooSmallException {
		System.out.print("Bitte gib eine Zahl ein: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		if (i > 5)
			throw new NumberTooBigException(); // unchecked exceptions werden nicht vom Compiler geprüft
		else if (i < 5)
			throw new NumberTooSmallException(); // checked exceptions werden vom Compiler geprüft
	}

}
