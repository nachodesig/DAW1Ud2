package Actividades;

import java.util.Scanner;

public class main_calificaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce tu nota: ");
		int n1 = sc.nextInt();
		
		Calificacion c1 = new Calificacion(n1);
		c1.mostrarResultadoIf();
		
		c1.mostrarResultadoSwitch();
		
		c1.getNota();
		
	}

}
