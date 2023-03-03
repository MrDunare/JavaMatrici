import java.util.Random;

public class EsMatrici2 {

	public static void main(String[] args) {
		
		/*
		 * prima della matrice stampare un vettore di 8 elementi e riempirlo con random
		 * 
		 * 
		 * data una matrice 2 * 2
		 * riempire la mtrice con random
		 * 
		 */
		Random random = new Random();
		
		int vett [] = new int [8];
		
		for (int i = 0; i < vett.length; i++) {
			vett[i] = random.nextInt(1,11);
			System.out.println(vett[i]);
		}
		
		
	}

	

}
