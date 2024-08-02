package ACTIVIDAD3;
import java.util.Scanner;
/*
 * 24.Realizá un programa que permita al usuario ingresar dos números enteros num1 y num2,
donde el primero siempre deberá ser menor o igual al segundo. La computadora debe
mostrar la secuencia de números existentes entre ambos:
a. Incluyéndolos;
b. Excluyéndolos.
 */
public class Ej24 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		int nro1;
		int nro2;
		
		do {
			System.out.println("ingrese el primer numero");
			nro1 = Integer.parseInt(input.nextLine());
			
			System.out.println("ingrese el segundo numero");
			nro2 = Integer.parseInt(input.nextLine());
				
		} while (nro1 > nro2 && nro1 == nro2);
		
		if (nro1 == nro2) {
			System.out.println("No hay secuencia demostrable ya que ambos numeros son iguales.");
		} else {
			System.out.println("Secuencia incluyendo los números: desde " +nro1 +" hasta " +nro2);
	        for (int i = nro1; i <= nro2; i++) {
	            System.out.print(i + " ");
	        }
	        System.out.println(); // Imprimir un salto de línea después de la secuencia incluyendo los números
	        
	        System.out.println("Secuencia excluyendo los números: desde " +(nro1 +1) +" hasta " +(nro2 -1));
	        for (int i = nro1 + 1; i < nro2; i++) {
	            System.out.print(i + " ");
	        }
		}
		
		
	}
}

