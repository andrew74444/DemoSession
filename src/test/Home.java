package test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Home {

	public static void main(String[] args) {

		Test t = new Test();
		Class clazz = t.getClass();
		System.out.println(clazz.getSimpleName());

		Method[] arryOfMethods = clazz.getDeclaredMethods();
		System.out.println(arryOfMethods.length);

		for (Method m : arryOfMethods) {

//			System.out.println(m.getName());
			 System.out.println(m.getName() + " Return type is ------" + m.getReturnType());
			
		
			Parameter[] ap = m.getParameters();
			 System.out.println(ap.length);
			
			 for (Parameter p : ap) {
			
			 System.out.println(p.getName());
		}

			 
			 System.out.println("-----------Constructors----------");
			 
			 Constructor[] cons = clazz.getDeclaredConstructors();
				 System.out.println(cons.length);
				
				 for(Constructor c: cons){
				
				 System.out.println(c.getName());
			 
				 }
		//
		// Method[] arryOfMethods = clazz.getDeclaredMethods();
		// System.out.println(arryOfMethods.length);
		// for (Method m : arryOfMethods) {
		//
		// System.out.println(m.getName());
		//
		// }
		// for (Method m : arryOfMethods) {
		//
		// System.out.println(m.getName() + "Return type is ------" +
		// m.getReturnType());
		// Parameter[] ap = m.getParameters();
		// System.out.println(ap.length);
		//
		// for (Parameter p : ap) {
		//
		// System.out.println(p.getName());
		//
		// }
		//
		// }
		//
		// Constructor[] cons = clazz.getDeclaredConstructors();
		// System.out.println(cons.length);
		// for(Constructor c: cons){
		//
		// System.out.println(c.getName());
		//
		// }

	}

	}}
