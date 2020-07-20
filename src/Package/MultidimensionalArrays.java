package Package;

public class MultidimensionalArrays {

	public void twoDArray()

	{
		int rows = 3;
		int cols = 3;

		int[][] table = new int[rows][cols];

		table[0][0] = 21;
		table[0][1] = 34;
		table[0][2] = 50;

		table[1][0] = 33;
		table[1][1] = 44;
		table[1][2] = 55;

		table[2][0] = 78;
		table[2][1] = 89;
		table[2][2] = 90;

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {

				System.out.print(" " + table[i][j]);

			}
			System.out.println("  ");
		}

	}

	public static void main(String[] args) {
		int[][] myArray2 = { { 1, 2, 3, 4 }, { 23, 55, 6, 77, 999 } };

		System.out.println(myArray2.length);
		for (int i = 0; i < myArray2.length; i++) {
			for (int j = 0; j < myArray2[i].length; j++) {
				myArray2[i][j] = j;
			}
		}
		for (int i = 0; i < myArray2.length; i++) {
			for (int j = 0; j < myArray2[i].length; j++) {
				System.out.print(myArray2[i][j] + "\t");
				// System.out.print("\t");
			}
			System.out.println();
		}

		MultidimensionalArrays.enahancedForLoop();
		
		MultidimensionalArrays md = new MultidimensionalArrays ();
		md.pyramidOfStars();
	}

	public void pyramidOfStars() {

		{
			for (int outer = 1; outer <= 5; outer++) {
				for (int inner = 1; inner <= outer; inner++) {
					System.out.print(inner);
				}
				System.out.println();
			}
		}

	}

	public static void enahancedForLoop() {

		int[][] myArray2 = { { 1, 2, 3, 4 }, { 23, 55, 6, 77, 999 } };
		
		
		for (int[] x : myArray2) {
			for (int y : x) {
				System.out.print(y + "\t");
			}
			System.out.println();
		}

	}

}
