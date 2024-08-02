package ACTIVIDAD3;
import java.util.Scanner;

/*
 * 36.Realizá un programa que permita ingresar números mientras el promedio entre todos los
ingresados sea menor a 20. Al terminar el ingreso indicar la cantidad de valores leídos. [EC]
 */
public class Ej36 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		int nro;
		double promedio = 0;
		int acumulador = 0;
		int contador = 0;
		
		do {
			System.out.println("Ingrese un numero");
			nro = Integer.parseInt(input.nextLine());
			acumulador += nro;
			contador++;
			promedio = acumulador / contador;
			
		} while (promedio < 20);

		System.err.println("La cantidad de numeros ingresados fueron: " +contador +" y el promedio es: " +promedio);
		
		input.close();
	}

}
