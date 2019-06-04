class CallEg {
	public void methodA() throws ArithmeticException {
		// a) int a = 42 / 0;

		/* b)*/ methodB();

		try {
			methodB();
		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		}
	}

	public void methodB() throws ArithmeticException {
		/* c)*/  //methodC();

		try {
			methodC();
		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		}
	}

	public void methodC() throws ArithmeticException {
		/* b)*/ int a = 42 / 0;

		/*try {
			int a = 42 / 0;
		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		}*/
	}
}






public class TestTrace {
	public static void main(String[] args) {
		CallEg eg = new CallEg(); // use default constructor
		try {
			eg.methodA();
		} catch (ArithmeticException oops) {
			oops.printStackTrace();
		}

		// insgesamt lässt sich beobachten, dass der StackTrace bei einer weiteren
		// Verschachtelung der Funktionen länger wird.
	}
}
