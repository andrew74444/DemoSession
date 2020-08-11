package Date_11th_Aug_Exceptions;

public class Test_Exceptions {

	public static void main(String[] args) {
		
		 try {
		int[] myNumbers = {1, 2, 3};
	    System.out.println(myNumbers[10]);
		 }
		 
		 catch (Exception e){
			 System.out.println("Something Went Wrong !!!!");
			 int[] myNumbers = {1, 2, 3};
			    System.out.println(myNumbers[10]);
		 }

		 finally {
		      System.out.println("The 'try catch' is finished.");
		    }
		 
		 
	}

}
