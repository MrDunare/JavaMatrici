import java.util.Scanner;

public class Es3doppioCiclo {

	public static void main(String[] args) {
		
		/*
		 * es: input un numero > 0 -----> richiedi il numero
		 * 
		 * 
		 * 
		 * 
		 */
		
		Scanner key = new Scanner (System.in);
		int numero;
		
		do {
			
			System.out.println("Inserisici un numero");
			numero = key.nextInt();
			
			
		} while (numero <= 0);
		
		
		for (int i = 0; i < numero; i++) {
			System.out.println();
			
			for (int j = 0; j < numero ; j++) {
				System.out.print("* ");
					
			}
			
		}
		
		key.close();
		
	}

}
