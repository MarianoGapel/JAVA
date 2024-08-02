package ACTIVIDAD3;
import java.util.Scanner;
/*
 * 22.Realizá un programa que muestre todos los números enteros del 1 al 5, y luego los mismos números pero en orden inverso. [EC]
 */
public class Ej22 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		System.out.println("----------");
		
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
	}

}
