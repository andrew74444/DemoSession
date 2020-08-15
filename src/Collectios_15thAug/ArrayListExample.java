package Collectios_15thAug;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda"); 
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	    cars.remove("Mazda");
	    System.out.println(cars);
	    System.out.println(cars.get(0));
	    
	    
	    cars.set(0, "Opel");
	    System.out.println(cars.get(0));
	    System.out.println(cars);
	    System.out.println(cars.size());
	    
	    
	    
	    for (int i = 0; i < cars.size(); i++) {
	        System.out.println(cars.get(i));
	      }
	    
	    
	    for (String i : cars) {
	        System.out.println(i);
	    }
	    
	    
	    
	    
	    cars.clear();
	    System.out.println(cars);
	    
	    
	    
	    ArrayList<Integer> carsNum = new ArrayList<Integer>();
	    carsNum.add(10);
	    carsNum.add(30);
	    carsNum.add(50);
	    System.out.println(carsNum);	    
	    
	    
	    ArrayList<Object> x = new ArrayList<Object>();
	    x.add(10);
	    x.add(true);
	    x.add("sasi");
	    System.out.println(x);
	    
	    
	    
	    
	    
		
	}
	
	

}
