package OverRidding;

public class customer {
	
	public static void main(String args[]){  
	SBI sbi = new SBI ();
	System.out.println(sbi.getRateOfInterest());
	
	ICICI i = new ICICI ();
	System.out.println(i.getRateOfInterest());
	
	
	

	
 // Code here CANNOT use x

    { // This is a block

      // Code here CANNOT use x

      int x = 100;

      // Code here CAN use x
     
      System.out.println(x);
   } // The block ends here
    
    
    
    
    
    int k = 0;
    while (k < 5) {
    
    	int m = 20;
    	System.out.println(m);
      k++;
    }
    
    
    int result = sum(-10);
    System.out.println(result);
  }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;
    }
    
    
    
    
	
	}
	

}
