package ACTIVIDAD3;
import java.util.Scanner;

/*
 * 34.Realizá un programa que permita ingresar la estatura (en metros con decimales) de cada
jugador de un equipo de baloncesto. La carga finalizará al ingresar cero. Calcular y mostrar la
estatura promedio del equipo.
 */
public class Ej34 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
	
		double estatura;
		double estaturasAcumuladas = 0;
		double promedio;
		int cantJugadores = 0;
		
		do {
			System.out.println("Ingrese la estatura de un jugador");
			estatura = Double.parseDouble(input.nextLine());
			estaturasAcumuladas += estatura;
			cantJugadores++;
			
		} while (estatura != 0);
		
		cantJugadores--;
		promedio = estaturasAcumuladas / cantJugadores;
		System.out.println("El promedio de alturas es: "+promedio);
			
	}
}
