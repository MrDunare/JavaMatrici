
public class Esmatrici {

	public static void main(String[] args) {
		
//		int [][] matrix = new int[2][5];
		
		
//		matrix[0][0] = 10;
//		matrix[0][1] = 20;
//		
//		matrix[1][0] = 50;
//		matrix[1][1] = 30;
//		
//		
//		System.out.println(matrix[0].length);	
//		System.out.println(matrix[1].length);
//		System.out.println(matrix[2].length);
		
		
		
		
		int [][] matrixBig = { {1,2,3} ,
								{4,5} ,
								{99}
								};
		
		// per tutti gli elementi dello zaino
		for (int i = 0; i < matrixBig.length; i++) {
			//per tutti gli elementi dell'astuccio
			for (int j = 0; j < matrixBig[i].length; j++) {
				
				//stampo matrice [0][1] poi va avanti il ciclo
				System.out.print(matrixBig[i][j] + " ");
			}
			
			System.out.println();
			
			
		}
			
		
				
		
		
		
		
		
		
	}
		
}
