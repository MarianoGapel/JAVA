package ACTIVIDAD2;
import java.util.Scanner;
/*
 * 20.Realizá un programa que permita ingresar dos números enteros y la operación a realizar  (+, -, *, /). 
 * Debe mostrarse el resultado para la operación ingresada. 
 * Considerar que no se puede dividir por cero (en ese caso mostrar el texto ' ERROR '). [EC]
 */

public class Ej20 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		
		int nro1;
		int nro2;
		double resultado;
		String operacion;
		
		System.out.println("Ingrese un numero entero");
		nro1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese otro numero entero:");
		nro2 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el tipo de operacion: +, -, *, /");
		operacion = input.nextLine();
		
		switch (operacion) {
		case "+":
			resultado = nro1 + nro2;
			System.out.println("La suma de los numeros ingresados es: " +resultado);
			break;
		case "-":
			resultado = nro1 - nro2;
			System.out.println("La resta de los numeros ingresados es: " +resultado);
			break;
		case "*":
			resultado = nro1 * nro2;
			System.out.println("La multiplicacion de los numeros ingresados es: " +resultado);
			break;
		case "/":
			if (nro2 == 0) {
				System.out.println("Error");
			} else {
				resultado = nro1 / nro2;
				System.out.println("La division de los numeros ingresados es: " +resultado);	
			}
			break;
		
		}
		
		input.close();
	}

}
