package bucle;

import java.util.Scanner;

public class Diapositiva42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		String vocal;
		
		//System.out.println("Introduce una vocal:");
		//vocal = sc.next();

		
		do {

			System.out.println("Introduce una vocal: ");
			 vocal = sc.next();
			 if(vocal.equals("A")|| vocal.equals("a")||
						vocal.equals("E")||vocal.equals("e")||
						vocal.equals("I")||vocal.equals("i")||
						vocal.equals("O")||vocal.equals("o")||
						vocal.equals("U")||vocal.equals("u")){
						
						System.out.println("Vocal validada");
						
						}else{
																	 
			 
						System.out.println("Eso no es una vocal");}
		}
		while(vocal.equals("A")|| vocal.equals("a")||
				vocal.equals("E")||vocal.equals("e")||
				vocal.equals("I")||vocal.equals("i")||
				vocal.equals("O")||vocal.equals("o")||
				vocal.equals("U")||vocal.equals("u"));
		
		System.out.println("Bucle terminado");
		
	}

}
