package Actividades;

import java.util.Scanner;

public class diapositiva15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Introduce el primer numero entero:");
	int n1 = sc.nextInt();
	
	System.out.println("Introduce el segundo numero entero:");
	int n2 = sc.nextInt();
	
	if(n1 == n2) {
		System.out.println("Los números son iguales");
	}
	else {
		System.out.println("Los números no son iguales");
	}
	
	}

}
