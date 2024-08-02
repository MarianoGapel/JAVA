package ACTIVIDAD3;
import java.util.Scanner;

/*
 * 35.Realizá un programa que permita ingresar nombre y edad de un grupo de personas (para
cada una, nombre y edad). La carga termina cuando en el nombre de la persona se ingresa un
asterisco ('*'). Mostrar al final cómo se llama la persona más joven.
 */
public class Ej35 {
	final static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		String nombre;
		String nombrePersonaMasJoven = "";
		int edad = 0;
		int edadPersonaMasJoven = 0;
		int edadMin = Integer.MAX_VALUE;
		
		do {
			System.out.println("Ingrese un nombre");
			nombre = input.nextLine();
			
			if (!nombre.equals("*")) {
				do {
					System.out.println("Ingrese la edad:");
					edad = Integer.parseInt(input.nextLine());
					if (edad <= 0) {
						System.out.println("La edad debe ser un número entero positivo. Inténtelo de nuevo.");
					}
				} while (edad <= 0);
			}
			
			if (edad < edadMin) {
				edadMin = edad;
				nombrePersonaMasJoven = nombre;
				edadPersonaMasJoven = edad;
			}
		} while (!nombre.equals("*"));

		if (nombrePersonaMasJoven.equals("*")) {
			System.out.println("Los datos cargados son invalidos.");
		} else {
			System.out.println("La persona mas joven es: " +nombrePersonaMasJoven +" que tiene " +edadPersonaMasJoven +" años");
		}
		
	}
}
