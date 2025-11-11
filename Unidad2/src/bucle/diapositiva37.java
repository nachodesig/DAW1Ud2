package bucle;

import java.util.Scanner;

public class diapositiva37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int n1 = sc.nextInt();
		
		while(n1 != 0 ) {
			if(n1 % 2 == 0) {
				System.out.println("Este número es par");

			}else {
				System.out.println("Este número es impar");

			}
			System.out.println("Introduce otro número");
			n1 = sc.nextInt();

		}
		System.out.println("Has finalizado el bucle");
	}

}
