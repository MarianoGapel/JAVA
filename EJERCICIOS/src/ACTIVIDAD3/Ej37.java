package ACTIVIDAD3;
import java.util.Scanner;
/*
 * 37.Realizá un programa que permita al usuario ingresar hasta 12 valores, de a uno por vez, que
representan los sueldos mensuales que percibió un empleado durante un año calendario. 
Si durante la carga de los sueldos mensuales se detecta un valor negativo, esto indica que aún
no se ha cobrado el mes en curso, y en ese caso se debe dejar de ingresar datos. 
Al finalizar mostrar el monto percibido por el empleado hasta ese momento (total o parcial).
 */
public class Ej37 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		int sueldo;
		int i = 1;
		int sueldoAcumulado = 0;
			
		do {
			System.out.println("Ingrese el sueldo del mes " +i);
			sueldo = Integer.parseInt(input.nextLine());
			if (sueldo > 0) {
                sueldoAcumulado += sueldo;
                i++;
            }
		} while (sueldo > 0 && i < 13);
		
		if (i <= 12) {
			System.out.println("El sueldo acumulado parcialmente es: " +sueldoAcumulado);
		} else {
			System.out.println("El sueldo acumulado totalmente es: " +sueldoAcumulado);
		}
		
		
	}

}
