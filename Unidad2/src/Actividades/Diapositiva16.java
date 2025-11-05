package Actividades;

import java.util.Scanner;

public class Diapositiva16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el primer numero entero:");
		int n1 = sc.nextInt();

		System.out.println("Introduce el segundo numero entero:");
		int n2 = sc.nextInt();

		
		if(n1 > n2 ) {
			System.out.println(n1 +" es mayor que " + n2);
		}
		else {
			System.out.println(n1 +" es menor que " + n2);

		}
	}

}
