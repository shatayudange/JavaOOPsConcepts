package OOPConcepts;

public class BaseClassExample extends SuperCLassExample {

	public static void printStatment() {
		System.out.println("Base class 1 with same method name");
	}
	
	public static void main(String args[]) {
		//inherited method
		printStatment();
	}
}
