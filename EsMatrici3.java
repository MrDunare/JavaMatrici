
import java.util.Random;

public class EsMatrici3 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int [][] matrix = new int [2][2];
		
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix [i][j] = random.nextInt(1,11);
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
