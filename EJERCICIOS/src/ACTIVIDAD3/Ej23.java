package ACTIVIDAD3;
import java.util.Scanner;

/*
 * 23.Realiz� un programa que permita ingresar un n�mero entero n. Debe mostrar los primeros 10 m�ltiplos de n (desde 1 x n).
 */
public class Ej23 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		int nro;
		
		System.out.println("Ingrese un numero");
		nro = Integer.parseInt(input.nextLine());
		
		for (int i = 1; i <= 10; i++) {
			System.err.println("El numero ingresado: "+nro+ " multiplicado por " + i+ " es: " +nro * i);
		}

	}

}
