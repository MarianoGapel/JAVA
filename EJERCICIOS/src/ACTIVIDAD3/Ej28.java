package ACTIVIDAD3;
import java.util.Scanner;

/*
 * 28.Realiz� un programa que a partir de un n�mero entero cant ingresado por el usuario permita
cargar por teclado cant n�meros enteros. La computadora debe mostrar cu�l fue el mayor
n�mero y en qu� posici�n apareci�.
 */
public class Ej28 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		int cant;
		int num;
		int posicion = 0;
		int mayor = Integer.MIN_VALUE;
		System.out.println("Ingrese un valor que represente una cantidad.");
		cant = Integer.parseInt(input.nextLine());
		
		
		for (int i = 1; i <= cant; i++) {
			System.out.println("Ingrese un numero entero");
			num = Integer.parseInt(input.nextLine());
			
			if (num > mayor) {
				mayor = num;
				posicion = i;
			}
		}
		System.out.println("El numero mayor es: " +mayor +" ubicado en la posicion: " +posicion);
		
		input.close();
	}
}