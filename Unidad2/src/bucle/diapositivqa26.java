package bucle;

import java.util.Scanner;

public class diapositivqa26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int sumanumeros = 0;
		int contador = 0;
		
		System.out.println("Introduce 10 números enteros:");

		
		while(contador < 10 ) {
			int n1  = sc.nextInt();
			sumanumeros = sumanumeros + n1;
			contador ++;
		}
		
		System.out.println("La suma de estos números da " + sumanumeros);
		System.out.println("Y el promedio es de " + sumanumeros / 10 );
		
		
		
	}

}
