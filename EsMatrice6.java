import java.util.Random;
import java.util.Scanner;

public class EsMatrice6 {

	public static void main(String[] args) {
		
		/*
		 * programma che prende in input 2 interi
		 * verificando che tutti e due siano maggiori di zero altrimenti richiedere entrambi i numeri
		 * 
		 * 
		 * 
		 */
		Scanner key = new Scanner(System.in);
		
		Random random = new Random( );
		
		// "🥵" , "🥶 " , "  👿 ", " 👨🏻‍💻" 
		
		int row;
		int col;
		
		do {
			System.out.println("inserisci il primo numero:");
			row = key.nextInt();
			System.out.println("inserisci il secondo numero:");
			col = key.nextInt();
				
		} while (row <= 0 || col <= 0);
		
		System.out.println("--------------");
		
		String[][] matrix = new String [row][col];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				int emoji = random.nextInt(1,11);
				if (emoji == 1)
					matrix[i][j] = "😘"; //10%
				else if(emoji >= 2 && emoji<=4) 
					matrix[i][j] = "🥺"; //30%
				else if(emoji >= 5 && emoji<=7)
					matrix[i][j] = "💩"; // 30%‍
				else 
					matrix[i][j] = "😈"; // 30%
				System.out.print(matrix[i][j] + "\t");
						
			}
			System.out.println();
		}
		
		key.close();
		
	}
	
}
