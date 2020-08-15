package test;

public class Javatpoint {

	private int i;

	Javatpoint() {
	}

	Javatpoint(int i) {
		this.i = i;
	}

	public int getValue() {
		return i;
	}

	public void setValue(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return Integer.toString(i);
	}

	// Testing the custom wrapper class

	public static void main(String[] args) {
		Javatpoint j = new Javatpoint(10);
		System.out.println(j);
		System.out.println(j.getValue());
		System.out.println(j.getValue()+j.getValue());
		System.out.println(j.toString()+j.toString());
	}
}
