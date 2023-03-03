import java.util.Scanner;

public class EsMatrici4 {

	public static void main(String[] args) {
		
		/*
		 * data una matrice init {{5,7,2} , {1,3,2} , {55,66,99}};
		 * 
		 * prendere con scanner un numero dire se il numero è presente nella matrice 
		 * 
		 * se presente dire è presente oppure dire no
		 * 
		 * se possibile ottimizzare
		 */
		
		Scanner key = new Scanner(System.in);
		
		int [][] matrix = {{5,7,2} , {1,3,2} , {55,66,99}};
		
		
		System.out.println("inserisci un numero ");
		
		int numero = key.nextInt();
		
		int cont = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.println("Sto considerando " + matrix[i][j]);
				if(matrix[i][j] == numero) {
					cont++;				
					break;
				}		
			}	
			if(cont>=1)
				break;
			
		}
		
		if(cont >= 1) 
			System.out.println("ok");
			
		else
			System.out.println("no");
		
	
		key.close();

	}

}
