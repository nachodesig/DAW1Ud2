package Actividades;

import java.util.Scanner;

public class diapositiva7_2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int a = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int b = sc.nextInt();

        boolean esMultiplo = (b != 0) && (a % b == 0);
        System.out.println(esMultiplo);
    }
}



