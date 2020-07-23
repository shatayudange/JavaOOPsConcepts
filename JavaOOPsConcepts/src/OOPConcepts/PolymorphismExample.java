package OOPConcepts;

public class PolymorphismExample {
	
	
	public static int Sum(int x, int y) {
		return x+y;
	}
	
	public static int Sum(int x,int y,int z) {
		return x+y+z;
	}
	
	public static void main(String[] args) {
	System.out.println(""+Sum(1,3));	
	System.out.println(""+Sum(1,5,8));

	}

}
