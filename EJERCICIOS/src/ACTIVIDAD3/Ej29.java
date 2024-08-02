package ACTIVIDAD3;
import java.util.Scanner;
/*
 * 29.Realizá un programa que permita validar la nota de un examen. 
 * Se espera que la nota que el usuario ingrese sea un número comprendido entre 0 y 10. 
 * La misma debe ser ingresada tantas veces como sea necesario hasta que quede comprendida dentro del rango indicado.
 */
public class Ej29 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
	
		
		int nota;
		
		do {
			System.out.println("Ingrese la nota. Entre 0 y 10");
			nota = Integer.parseInt(input.nextLine());
		} while (nota > 10 || nota < 0);
		
		System.out.println("La nota ingresada ha sido correcta.");
	}

}
