package Package;

public class C {

	public static void main(String[] args) {

		int i = 1;

		while (i < 100) {
			System.out.println(i);
			i++;
		}
		
		int j = 1000;
		System.out.println("<------------Do While------------>");
		
		
		do {
			System.out.println(j);
			j++;
		} while (j < 100);

	
		System.out.println("<------------For Loop------------>");
	
	
	for(int k = 1;k<50;k++) {
		
		System.out.println(k);
		
		
	}
	
	
	
	
	
	System.out.println("<------------Nested For Loop------------>");
	
	
	for (int outer =0; outer<5 ; outer++)
	{
		for (int inner= 0; inner <3; inner++)
			{
				System.out.println("outer is " + outer + " inner is" + inner);
			}//inner loop ends
	}//outer loop ends
	
	
	System.out.println("<------------break------------>");
	
	
	
	for (int l = 0; l < 10; l++) {
		  if (l == 4) {
		    break;
		  }
		  System.out.println(l);
		}
	System.out.println("<------------continue------------>");
	for (int m = 0; m < 10; m++) {
		  if (m == 4) {
		    continue;
		  }
		  System.out.println(m);
		}

	
	
	
	System.out.println("<------------Switch------------>");
	
	int x =1;
	
	switch(x)
	{
	case 1:
	System.out.println("case1");
	break;
	case 2:
	System.out.println("case2");
	break;
	case 3:
	System.out.println("case 3");
	break;
	default:
	System.out.println("default case");
	}

	
	
	
	}
	
	
}
