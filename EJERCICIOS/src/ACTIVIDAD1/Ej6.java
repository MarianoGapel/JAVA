package ACTIVIDAD1;
import java.util.Scanner;

/*
 * Realizá un programa que permita ingresar el monto total de las ventas realizadas por un
vendedor durante el mes, de quien se sabe que gana un sueldo fijo de 44000 pesos más el 16
por ciento del monto total vendido. Con tales datos debes calcular y mostrar el importe a
cobrar por el vendedor.
 */


public class Ej6 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		final int SUELDO_FIJO = 44000;
		final int COMISION = 16;
		int montoVentasRealizadas;
		int sueldoFinal;
		
		System.out.println("Ingrese el monto total de ventas realizadas:");
		montoVentasRealizadas = Integer.parseInt(input.nextLine());
		
		sueldoFinal = SUELDO_FIJO + (montoVentasRealizadas * COMISION / 100);
		
		System.out.println("El sueldo final es: " +sueldoFinal);
		
		input.close();
	}

}
