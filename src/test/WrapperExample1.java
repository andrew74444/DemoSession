package test;

import java.util.ArrayList;

public class WrapperExample1 {

	
	public static void main(String args[]){  
		
//		ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
		
		ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // valid
		
		Integer myInt = 5;
	    Double myDouble = 5.99;
	    Character myChar = 'A';
	 
	    System.out.println(myInt);
	    System.out.println(myDouble);
	    System.out.println(myChar);

	    System.out.println(myInt.intValue());
	    System.out.println(myDouble.doubleValue());
	    System.out.println(myChar.charValue());

	    Integer myInt1 = 100;
	    String myString1 = myInt1.toString(); //autoBoxing
	    System.out.println(myString1.length());

	    
	    Integer myInt2 = 100;
	    String myString2 = myInt2.toString();
	    System.out.println(myString2.length());

	    System.out.println(myInt1+myInt2);
	    System.out.println(myString1+myInt2);
	    String myString3 = "Sai";
	    String myString4 = "Kumar";
	    System.out.println(myString3+myString4);
	    String myString5 = "300";
	    String myString6 = "400";
	    System.out.println(myString5+myString6);

	    
	    
	    
	    
	    
	    int a=20;  
	    Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
	    Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
	      
	    System.out.println(a+" "+i+" "+j);  
	    
	    
	    
	    Integer a1=new Integer(3);
	    System.out.println(a1);
	    int i1=a1.intValue();//converting Integer to int explicitly  
	    int j1=a1;//unboxing, now compiler will write a.intValue() internally    
	        
	    System.out.println(a1+" "+i1+" "+j1);    


	   
//		//Converting int into Integer  
//		int a=20;  
//		Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
//		Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
//		  
//		System.out.println(a+" "+i+" "+j);  
//		
//		String s = String.valueOf(i);
//		System.out.println(s+s);
//		
//		i = Integer.parseInt(s);
//		System.out.println(i+i);
		}
	
}
