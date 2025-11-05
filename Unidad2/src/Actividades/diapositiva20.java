package Actividades;

import java.util.Scanner;

public class diapositiva20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el primer numero: ");
		int n1 = sc.nextInt();

		System.out.println("Introduce el segundo numero: ");
		int n2 = sc.nextInt();

		System.out.println("Introduce el tercer numero: ");
		int n3 = sc.nextInt();

		if (n1 > n2 && n2 > n3) {
			System.out.println("De mayor a menor: " + n1 + " " + n2 + " " + n3);
			} else if (n1 > n2 && n3 > n2) {
				System.out.println("De mayor a menor: " + n1 + " " + n3 + " " + n2);
				} else if (n2 > n1 && n1 > n3) {
					System.out.println("De mayor a menor: " + n2 + " " + n1 + " " + n3);
					} else if (n2 > n1 && n3 > n1) {
						System.out.println("De mayor a menor: " + n2 + " " + n3 + " " + n1);
						} else if (n3 > n2 && n2 > n1) {
							System.out.println("De mayor a menor: " + n3 + " " + n2 + " " + n1);
							} else if (n3 > n1 && n1 > n2) {
								System.out.println("De mayor a menor: " + n3 + " " + n1 + " " + n2);
								}else {
									System.out.println("ERROR: Introduce números diferentes ");
									
								}
		}
		
	}


