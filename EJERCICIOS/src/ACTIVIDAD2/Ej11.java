package ACTIVIDAD2;
import java.util.Scanner;
/*
 * Realiz� un programa que permita ingresar un n�mero entero e indique si se trata de un n�mero par o impar.
 */
public class Ej11 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		int nro;
		
		System.out.println("Ingrese un numero");
		nro = Integer.parseInt(input.nextLine());
		
		if (nro % 2 == 0) {
			System.out.println("Es par");
		}

	}

}
