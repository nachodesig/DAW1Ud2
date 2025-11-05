package Actividades;

import java.util.Scanner;

public class pedirNumero041125 {

	
	public static int pedirNumero() {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Introduce un número entero: ");
		    int numero = sc.nextInt();
		    return numero;		
	}
	public static int pedirNumero(int n) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Introduce un número entero mayor que " + n );
		    int numero = sc.nextInt();
		    return numero;		
	}
	
	public static int pedirNumero(int min, int max) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Introduce un número entero mayor que " + min +" y menor que " + max);
		    int numero = sc.nextInt();
		    return numero;		
	}
}
