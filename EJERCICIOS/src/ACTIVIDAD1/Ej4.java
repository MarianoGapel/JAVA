package ACTIVIDAD1;
import java.util.Scanner;
/*
 * Realiz� un programa que permita ingresar el valor monetario de una hora de trabajo y la
cantidad de horas trabajadas por d�a por un trabajador. Debes mostrar el valor del salario
semanal, sabiendo que trabaja todos los d�as h�biles y la mitad de las horas del d�a h�bil los
s�bados. (Todas las horas valen lo mismo.)
 */

public class Ej4 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		int valorHoraDeTrabajo;
		int cantidadHorasPorDia;
		int salarioDiario;
		int salarioSemanal;
		int salarioSabado;
		
		System.out.println("Ingrese el valor monetario de una hora de trabajo");
		valorHoraDeTrabajo = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese la cantidad de horas trabajadas por dia");
		cantidadHorasPorDia = Integer.parseInt(input.nextLine());
		
		salarioDiario = valorHoraDeTrabajo * cantidadHorasPorDia;
		
		int horasSabado = cantidadHorasPorDia / 2;
		salarioSabado = valorHoraDeTrabajo * horasSabado;
		
		salarioSemanal = (salarioDiario * 5) + salarioSabado;
		
		System.out.println("El salario semanal es de: " +salarioSemanal);	

		input.close();

	}
}
