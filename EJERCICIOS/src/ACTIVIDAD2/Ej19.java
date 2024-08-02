package ACTIVIDAD2;
import java.util.Scanner;
/*
 * Existen dos reglas que identifican dos conjuntos de valores:
a. El número es de un solo dígito.
b. El número es impar.
A partir de estas reglas, realizá un programa que permita ingresar un número entero. 
Debe asignar el valor que corresponda a las variables booleanas esDeUnSoloDigito, esimpar,
estaEnAmbosGrupos y noEstaEnNingunGrupo el valor Verdadero o Falso, según corresponda,
para indicar si el valor número ingresado pertenece o no a cada conjunto. Al terminar el
programa debe informar el número cargado y las cuatros variables lógicas. Definí un lote de
prueba de varios números y probá el algoritmo, escribiendo los resultados tal como se hizo
en los ejercicios anteriores.
 */

public class Ej19 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {
		
		int nro;
		boolean esDeUnSoloDigito = false;
		boolean esImpar = false;
		boolean estaEnAmbosGrupos = false;
		boolean noEstaEnNingunGrupo = false;
		
		System.out.println("Ingrese un numero");
		nro = Integer.parseInt(input.nextLine());
		
		if ((nro >= 0 && nro <= 9) || (nro <= 0 && nro >= -9)) {
			esDeUnSoloDigito = true;
		}
		if (nro % 2 != 0) {
			esImpar = true;
		}
		if (esDeUnSoloDigito && esImpar) {
			 estaEnAmbosGrupos = true;
		} else {
			noEstaEnNingunGrupo = true;
		}
		
		System.out.println("El numero cargado es: " +nro);
		System.out.println("¿Es de un solo digito? " +esDeUnSoloDigito);
		System.out.println("¿Es impar? " +esImpar);
		System.out.println("¿Es de un solo digito? " +esDeUnSoloDigito);
		System.out.println("¿Esta en ambos grupos? "+estaEnAmbosGrupos);
		System.out.println("¿No esta en nigun grupo? "+noEstaEnNingunGrupo);
	}

}