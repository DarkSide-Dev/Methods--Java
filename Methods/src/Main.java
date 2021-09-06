
public class Main {

	public static void main(String[] args) {
		
		helloWorld();
		System.out.println();
		welcome("anonymous", 32);
		
		int id = add(32, 16);
		
		System.out.println();
		
		System.out.println("Your id is: "+id);

	}
	
	static void helloWorld() {
		
		System.out.println("Hello World");
		
	}
	
	static void welcome(String name, int visit) {
		System.out.println("Welcome "+name+"\nYou are our "+visit+"º visitor!!");
	}
	
	static int add(int x, int y) {
		return x+y;
	}

}
