package ACTIVIDAD1;
import java.util.Scanner;


/*
 * Realizá un programa que permita ingresar dos números que representan las medidas en
grados de dos ángulos interiores de cierto triángulo. A partir de los valores de estos dos
ángulos el programa debe mostrar el valor en grados del ángulo restante. Recordá que la
suma de los ángulos interiores de todo triángulo es de 180".
 */
public class Ej9 {

	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		int angulo1;
		int angulo2;
		int angulo3;
		
		System.out.println("Ingrese la medida del angulo 1:");
		angulo1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese la medida del angulo 2:");
		angulo2 = Integer.parseInt(input.nextLine());
		
		angulo3 = 180 - (angulo1 + angulo2);
		
		System.out.println("Los grados del 3 angulo es: " +angulo3);
		System.out.println("La suma de los 3 angulos es: " +(angulo1+angulo2+angulo3));		
				
		input.close();
	}

}
