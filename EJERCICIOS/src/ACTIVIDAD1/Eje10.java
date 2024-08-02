package ACTIVIDAD1;
import java.util.Scanner;

/*
 * Realizá un programa que permita resolver el siguiente problema: Tres personas aportan
diferente capital a una sociedad y desean saber el valor total aportado y qué porcentaje
aportó cada una (indicando nombre y porcentaje). Solicitar la carga por teclado del nombre
de cada socio, su capital aportado y a partir de esto calcular e informar lo requerido
previamente.
 */


public class Eje10 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		String nombre1;
		String nombre2;
		String nombre3;
		double capital1;
		double capital2;
		double capital3;
		
		System.out.println("Ingrese el nobmre del aportante nro1");
		nombre1 = input.nextLine();
		
		System.out.println("Ingrese el cappital del aportante nro1");
		capital1 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el nobmre del aportante nro2");
		nombre2 = input.nextLine();
		
		System.out.println("Ingrese el cappital del aportante nro2");
		capital2 = Integer.parseInt(input.nextLine());
		
		System.out.println("Ingrese el nobmre del aportante nro3");
		nombre3 = input.nextLine();
		
		System.out.println("Ingrese el cappital del aportante nro3");
		capital3 = Integer.parseInt(input.nextLine());
		
		
		final double TOTAL_APORTADO = capital1 + capital2 + capital3;
		double porcentaje1 = (capital1 * 100) / TOTAL_APORTADO;
		double porcentaje2 = (capital2 * 100) / TOTAL_APORTADO;
		double porcentaje3 = (capital3 * 100) / TOTAL_APORTADO;
		
		System.out.println("El total aportado es de: " +TOTAL_APORTADO);
		System.out.println("El primer aportante: " +nombre1 + " aportó: $" +capital1 + " que representa al " +porcentaje1 +"%");
		System.out.println("El primer aportante: " +nombre2 + " aportó: $" +capital2 + " que representa al " +porcentaje2 +"%");
		System.out.println("El primer aportante: " +nombre3 + " aportó: $" +capital3 + " que representa al " +porcentaje3 +"%");
		
		input.close();
		

	}

}