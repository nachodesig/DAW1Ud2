package bucle;

import java.util.Scanner;

public class diapositiva44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		int sumanumeros = 0;
		
		System.out.println("Introduce los 10 números: ");
		
		
		
		do {
			int n1 = sc.nextInt();
			sumanumeros = sumanumeros + n1;
			contador ++;
		}while(contador < 10 );
		System.out.println("La suma de todos los números introducidos es " + sumanumeros);
	}

}
