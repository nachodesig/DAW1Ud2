package Actividades;

import java.util.Scanner;

public class diapositiva7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);


        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        
        boolean resultado  = (num1 != num2) || (num1 == 0 || num2 == 0);
        System.out.println("Resultado: " + resultado);

		
	
	}
	
}
