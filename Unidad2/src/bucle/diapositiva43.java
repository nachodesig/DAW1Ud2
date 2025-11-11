package bucle;

import java.util.Scanner;

public class diapositiva43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);

		int n1;
		int n2;

		do {
			

			System.out.println("Introduce el primer número: ");
			 n1 = sc.nextInt();

			System.out.println("Introduce el primer número: ");
			n2 = sc.nextInt();
			
			System.out.println("números leídos");
		}while(n1 != n2);

		System.out.println("Se acabó el bucle lo números son iguales");
	}

}
