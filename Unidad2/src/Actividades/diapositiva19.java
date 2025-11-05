package Actividades;

import java.util.Scanner;

public class diapositiva19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		
		int n1 =sc.nextInt();
		
		
		if(n1 <= 9) {
			System.out.println("Este numero es de una cifra");
		}
		else if(n1 <= 99 &&  n1 >= 9) {
			System.out.println("Este numero es de dos cifras");
	}
		else if(n1 <= 999 &&  n1 >= 99) {
			System.out.println("Este numero es de tres cifras");
	}
		else if(n1 <= 9999 &&  n1 >= 999) {
			System.out.println("Este numero es de cuatros cifras");
			
		}
		else if(n1 <= 99999 &&  n1 >= 9999) {
			System.out.println("Este numero es de cinco cifras");
			
		}
	}
}
	
	
