package Package;

import java.util.*;

public class B {
	
	
	
	public static void main(String[] args)
	{
		B t = new B();	
	Scanner scan = new Scanner(System.in); //ignore
	System.out.println("enter a value");
	int input = scan.nextInt(); //ignore
	scan.close(); //ignore
	int randomNum = (int)(Math.random()* 10);
	if(input == randomNum)
	System.out.println("well done smarty");
	else
	t.number(randomNum);
	System.out.println("randomNum is ----> "+randomNum);
	}
	
	public void number(int randomNum)
	{
	
	if (randomNum == 0)
	System.out.println("Zero");
	else if (randomNum == 1)
	System.out.println("One");
	else if (randomNum == 2)
	System.out.println("Two");
	else if (randomNum == 3)
	System.out.println("Three");
	else if (randomNum == 4)
	System.out.println("Four");
	else
	System.out.println("Above 4");
	}

	
	

}
