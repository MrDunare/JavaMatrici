
public class EsMatrici5 {

	public static void main(String[] args) {
		
		/*
		 * data una matrix fatta cosi
		 * 
		 * 
		 * 
		 * 
		 */
		
		int[][] matrix = {{5,2,1}
						,{1,10,3},
						{2,4,2}};
		
		int diagonale1 = 1;
		int diagonale2 = 1;
		int contScala = 1;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(i == j) {
					diagonale1 *= matrix[i][j];
				}
				if(j==matrix[i].length-contScala) {
					System.out.println("ok -----> " + matrix[i][j]);
					diagonale2 *= matrix[i][j];
				}
				
			}
			contScala++;
		}
		
		System.out.println(diagonale1);
		System.out.println(diagonale2);
		
	}

}
