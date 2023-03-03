import java.util.Scanner;

public class Es2AlberoAsterisco {
	
	public static void main(String[] args) {
		
		/*
		 * numero in input > 0 (semaforo)
		 * 
		 * n = 3  *
		 * 		  **
		 * 		  ***
		 */
		
		
		Scanner key = new Scanner (System.in);
		int numero;
		
		do {
			
			System.out.println("Inserisici un numero");
			numero = key.nextInt();
			
			
		} while (numero <= 0);
		
		
		for (int i = 0; i < numero; i++) {
			
			System.out.println();
			
			for (int j = 0; j < i + 1 ; j++) {
				
				System.out.print("*");		
				
			}
			
		}
	
		key.close();
			
	}

}
