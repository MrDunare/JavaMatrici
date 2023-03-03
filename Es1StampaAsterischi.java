import java.util.Scanner;

public class Es1StampaAsterischi {

	public static void main(String[] args) {
		
		/*
		 * Prendere un input un numero da tastiera
		 * 
		 * confrontalo e deve essere maggiore di 0
		 * 
		 * se è uguale a 0 o minore o uguale a 0 continua a chiedere di inserire il numero(semaforo)
		 * 
		 * se positivo : se n = 1 disegna * , se n = 2 disegna ** , se n è uguale a 3 disegna ***. 
		 * 
		 */

		Scanner key = new Scanner ( System.in);
		
		int numero;
		
		
		do {
			
			System.out.println("Inserisci un numero");
			numero = key.nextInt();
			
			
		} while (numero <= 0);
		
		
		for (int i = 0; i < numero; i++) {
			
			System.out.print("*"+" | ");
			
			
			
		}
				
		key.close();
		
	}

}
