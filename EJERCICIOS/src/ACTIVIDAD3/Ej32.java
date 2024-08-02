package ACTIVIDAD3;
import java.util.Scanner;

/*
 * 32.Realizá un programa que permita validar la nota de un examen de la misma manera que el
ejercicio 29 pero con las siguientes nuevas directivas:
-Las notas 1 y 3 no usan nunca.
-La nota O se reserva para los ausentes
En resumen, las notas válidas pueden ser un 2 o un valor entre 4 y 10. [EC]
 */
public class Ej32 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		int nota;
		
		do {
			System.out.println("Ingrese una nota");
			nota = Integer.parseInt(input.nextLine());
			
			if (nota == 1 || nota == 3) {
				System.out.println("La nota ingresada es invalida. Debe ser 0, 2 o un valor entre 4 y 10");
			} else if (nota == 0) {
				System.out.println("Ausente.");
			} else {
				System.out.println("La nota que se saco es: " +nota);
			}
			
		} while ((nota == 1 || nota == 3) || (nota < 0 || nota > 10 ));
			
	}
}
