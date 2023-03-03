import java.util.Scanner;

public class EsVarianteNUova {

	public static void main(String[] args) {
		
		
			
			/*
			 * numero n > 0 
			 * 
			 * n = 3
			 * 
			 * 
			 */
			
			Scanner key = new Scanner(System.in);
			int numero;
			
			do {
				System.out.println("inserisci numero");
				numero = key.nextInt();
				
			} while (numero <= 0);
			
			
			for (int i = 0; i < numero; i++) {
				System.out.println();
				for (int j = 0; j < numero; j++) {
					
					if(i == j)
						System.out.print("🤯 ");
					else if(i>j)
						System.out.print("O ");
					else
						System.out.print("* ");
				}
			}
		
			key.close();

	}

}
