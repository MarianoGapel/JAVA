package ACTIVIDAD2;
import java.util.Scanner;

/*
 * 13. Realizá un programa para ingresar tres números enteros e indique cuál de ellos es el mayor y su valor. 
 */
public class Ej13 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		int nro1;
		int nro2;
		int nro3;
		
		
		System.out.println("Ingrese nro1");
		nro1 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese nro2");
		nro2 = Integer.parseInt(input.nextLine());
		System.out.println("Ingrese nro3");
		nro3 = Integer.parseInt(input.nextLine());
		
		
		if (nro1 > nro2 && nro1 > nro3) {
			System.out.println("El mayor es el primer numero ingresado: "+nro1);
		} else if (nro2 > nro1 && nro2 > nro3) {
			System.out.println("El mayor es el segundo numero ingresado: "+nro2);
		} else {
			System.out.println("El mayor es el tercer numero ingresado: "+nro3);
		}
	}

}
