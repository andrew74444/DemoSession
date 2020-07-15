package Package;

public class A {

	
	int i = 100;
	int j = 200;
	
	
	public static void main(String[] args) {

		A a = new A();
		A b = new A();
		int z = a.sum(10, 20);

		System.out.println(z);

		System.out.println(a.mul(10, 20));
		System.out.println(a.mul(5, 30));
		System.out.println(a.mul(7, 6));
		System.out.println(a.mul(3, 9));

		String p = a.returnString();
		System.out.println(p);
		System.out.println("");
		System.out.println(a.returnString());

		System.out.println(a.trueOrFalse());
		
		a.test();
		
		
		
		
		a.printName("Sai");
		a.printName("Aditiya");
		
		
		
		
		a.increaseIvalue();
		a.addnumbers();		
		b.addnumbers();
		
		int t = a.i;
		System.out.println(t);
		
		a.multipleArguments(200, "Sasi", 'c');
		a.multipleArguments(500, "vinod", 'b');
		
		
		
		System.out.println((int) (Math.random() * 10));
	}

	public int sum(int x, int y) {
		int z = x + y;
		return z;
	}

	
	
	
	public int mul(int x, int y) {
		int z = x * y;
		return z;
	}

	public int sub(int x, int y) {
		int z = x - y;
		return z;
	}

	public String returnString() {

		String x = "Learning Java";

		return x;

	}

	public boolean trueOrFalse() {

		return false;

	}

	public void test() {

		int x = 20;
		int y = 30;
		int z = x + y;
		System.out.println(z);

	}

	
	public void printName(String name) {
		
		System.out.println(name);
		
	}
	
	
	public void addnumbers() {
		int z = i+j;
		System.out.println(z);
		
		
	}
	
	public void increaseIvalue() {
		i++;
		System.out.println(i);
	}
	
	
	public void multipleArguments(int q, String name, char c) {
		
		
		System.out.println("Q Value is----->" +q+" Name is ------>"+name+ " Single  char is -----> " + c);
		
		
		
	}
	
	
	
	
	
	
	
}
