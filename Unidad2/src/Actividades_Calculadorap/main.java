package Actividades_Calculadorap;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el primer numero: ");
		int numero1 = sc.nextInt();

		System.out.println("Introduce el segundo numero: ");
		int numero2 = sc.nextInt();

		System.out.println("Introduce el operador: ");

		String operador = sc.next();

		Calculadora c1 = new Calculadora(numero1 ,numero2 , operador);
		c1.calcularIf();
		c1.calcularSwitch();

	}

}
