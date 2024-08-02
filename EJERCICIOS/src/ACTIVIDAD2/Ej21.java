package ACTIVIDAD2;
import java.util.Scanner;

/*
 * 21.Realiz� un programa que permita al usuario ingresar un n�mero entero entre 1 y 7. 
 * Debe mostrarse por pantalla el nombre del d�a de la semana que representa tal n�mero tomando como el primer d�a de la semana el Domingo. 
 * De ingresar un n�mero fuera de rango debe mostrar error.
 */
public class Ej21 {
	
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		
		String dia;
		
		System.out.println("Ingrese un dia de la semana (1-7)");
		dia = input.nextLine();
		
		
		switch (dia) {
		case "1":
			System.out.println("Domingo");
			break;
		case "2":
			System.out.println("Lunes");
			break;
		case "3":
			System.out.println("Martes");
			break;
		case "4":
			System.out.println("Miercoles");
			break;
		case "5":
			System.out.println("Jueves");
			break;
		case "6":
			System.out.println("Viernes");
			break;
		case "7":
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Error");
			break;
		}

	}

}
