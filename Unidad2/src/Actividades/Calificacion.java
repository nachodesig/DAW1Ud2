package Actividades;

public class Calificacion {

	private int nota;

	public Calificacion(int nota) {
		this.nota = nota;
	}

	public void mostrarResultadoIf() {
		if (nota >= 0 && nota <= 4) {
			System.out.println("Insuficiente");
		} else if (nota == 5) {
			System.out.println("Suficiente");
		} else if (nota == 6) {
			System.out.println("Bien");
		} else if (nota == 7 || nota == 8) {
			System.out.println("Notable");
		} else if (nota == 9 || nota == 10) {
			System.out.println("Sobresaliente");
		}
	}

	public void mostrarResultadoSwitch() {
		switch (nota) {
		case 0:
			System.out.println("Insuficiente");break;
		case 1:
			System.out.println("Insuficiente");break;
		
		case 2:
			System.out.println("Insuficiente");break;
		
		case 3:
			System.out.println("Insuficiente");break;
		
		case 4:
			System.out.println("Insuficiente");break;
		
		case 5:
			System.out.println("Suficiente");break;
		
		case 6:
			System.out.println("Bien");break;
		
		case 7:
			System.out.println("Notable");break;
		
		case 8:
			System.out.println("Notable");break;
		
		case 9:
			System.out.println("Sobresaliente");break;
		
		case 10:
			System.out.println("Sobresaliente");break;
		}
	}

	public void setNota(int nota) {
		this.nota = nota;

	}

	public int getNota() {
		return nota;
	}

}
