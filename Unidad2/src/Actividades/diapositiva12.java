package Actividades;

import java.util.Scanner;

public class diapositiva12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número: ");
        int n1 = sc.nextInt();
		
        String resultado = "Es impar";
		if (n1 % 2 == 0) {
			resultado ="Este número es par";
			
		}
			System.out.println(resultado);
			
		
		

	}

}
