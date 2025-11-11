package bucle;

import java.util.Random;
import java.util.Scanner;

public class diapositiva45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		
		
		int n1 = rd.nextInt(1, 100);
		int n2 = rd.nextInt(1, 100);
		int solureal = n1 + n2;
		int numoperaciones = 0;
		
		
		System.out.println("Realiza la suma de " + n1 + " + " + n2 );
		int solusuario = sc.nextInt();
		
		do {
			n1 = rd.nextInt(1, 100);
			n2 = rd.nextInt(1, 100);
			solureal = n1 + n2;
			System.out.println("Solución correcta");
			System.out.println("Realiza la suma de " + n1 + " + " + n2 );
			solusuario = sc.nextInt();
			numoperaciones ++;		
		}while(solureal  == solusuario);
			
		
		System.out.println("Solución incorrecta");
		System.out.println("Has realizado " + numoperaciones + " operaciones");
		
	}

}
