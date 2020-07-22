package abcd;

public class test extends B {

	public static void main(String[] args) {

		facebook fb = new facebook();

		fb.login("test@gmail.com", 970);
		
		go();
		

	}

	public static void go() {

		System.out.println("im from class test ");

	}

}
