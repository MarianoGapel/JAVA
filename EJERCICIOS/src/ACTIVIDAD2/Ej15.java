package ACTIVIDAD2;
import java.util.Scanner;

/*
 * Para entrar a la monta�a rusa Miedo a las alturas, algo m�s chica y tranquila que la anterior, alcanza con que se cumpla solamente una de las siguientes condiciones: 
 * ser mayor de 6 a�os o medir m�s de 1,50 metros. 
 * Realiz� el mismo procedimiento que con el ejercicio anterior pero con los nuevos requisitos. [EC]

Nombre Edad Altura �Entra al juego? (V/F)
Juan    5    1.145
Mar�a   7    1.23
Luis    8    1.51
Ana     9    1.39
 */
public class Ej15 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		final int EDAD_MINIMA = 6;
		final double ALTURA_MINIMA = 1.5;
		
		int edad;
		double altura;
		
		System.out.println("ingrese la edad:");
		edad = Integer.parseInt(input.nextLine());

		System.out.println("ingrese la altura");
		altura = Double.parseDouble(input.nextLine());
		
		
		if (edad > EDAD_MINIMA || altura > ALTURA_MINIMA) {
			System.out.println("Puede ingresar al juego.");
		} else {
			System.out.println("No puede ingresar.");
		}
	}

}
