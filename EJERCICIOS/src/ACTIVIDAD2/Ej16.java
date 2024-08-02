package ACTIVIDAD2;
import java.util.Scanner;

/*
 * Realizá un programa que permita ingresar la cantidad de inscriptos a una conferencia y la
cantidad de asientos disponibles en el auditorio. Debes indicar si alcanzan los asientos, Si los
asientos no alcanzaran indicar cuántos faltan para que todos los inscriptos puedan sentarse.
 */
public class Ej16 {
	final static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		int cantInscriptos;
		int asientosDisponibles;
		int asientosFaltantes;
		
		System.out.println("Ingrese la cantidad de inscriptos.");
		cantInscriptos = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese la cantidad de asientos.");
		asientosDisponibles = Integer.parseInt(input.nextLine());
		
		if (cantInscriptos <= asientosDisponibles ) {
			System.out.println("Los asientos alcanzan para todos los participantes.");
		} else {
			asientosFaltantes = cantInscriptos - asientosDisponibles;
			System.out.println("La cantidad de asientos que faltan son: "+asientosFaltantes);
		}

	}

}
