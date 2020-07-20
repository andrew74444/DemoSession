package Package;

public class Array2d {

	
	public static void main(String [] args )
	{
		
		int[][] myArray2 = {{11,12,13,14,15},{10,20,30,40},{10,20,30}};
		System.out.println(myArray2.length);
		
		for(int i=0;i<myArray2.length;i++)
			{
			for (int j= 0; j<myArray2[i].length;j++ )
			{
			myArray2[i][j]= j;
			}
			}
			for (int i=0; i<myArray2.length;i++)
			{
			for (int j=0 ; j<myArray2[i].length; j++)
			{
			System.out.print(myArray2[i][j] + "\t");
			//System.out.print("\t");
			}
			System.out.println();
			}

	}



	public void twoDArray()

	{
		int rows =3;
		int cols =3;
		
		int[][] table= new int[rows][cols];
		
		table[0][0]=21;
		table[0][1]=34;
		table[0][2]=50;
		
		table[1][0]=33;
		table[1][1]=44;
		table[1][2]=55;
		
		table[2][0]=78;
		table[2][1]=89;
		table[2][2]=90;
		
		
		for(int i=0;i<rows;i++) {
			
			for(int j=0;j<cols;j++) {
				
				System.out.print(" " +table[i][j]);			
				
		}
			System.out.println("  ");
		}
		
	}
	}