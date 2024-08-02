package ACTIVIDAD3;
import java.util.Scanner;

/*
 * 38.Realizá un programa que permita controlar con validación el ingreso a un sitio web. Teniendo
ya precargados un nombre de usuario ("admin") y una contraseña ("123456"), el programa
debe permitir al usuario ingresar sus credenciales. Si las mismas son erróneas, se volverán a
pedir hasta un máximo de 3 intentos. Finalmente, la computadora debe mostrar alguno de los
siguientes mensajes según sea el caso: "Acceso concedido” o "Se ha bloqueado la cuenta”.

 */
public class Ej38 {
	final static Scanner input = new Scanner (System.in);
	public static void main(String[] args) {

		final String USUARIO_FINAL = "admin";
		final String PASSWORD_FINAL = "123456";
		final int MAX_INTENTOS = 3;
		String usuario;
		String pass;
		int contador = 1;
		
		do {
			System.out.println("Intento numero: " +contador+ ". Ingrese el usuario");
			usuario = input.nextLine();
			System.out.println("Intento numero: " +contador+ ". Ingrese la contraseña");
			pass = input.nextLine();
			contador ++;
			
		} while (!(usuario.equals(USUARIO_FINAL) && pass.equals(PASSWORD_FINAL)) && contador <= MAX_INTENTOS);
	
		if (usuario.equals(USUARIO_FINAL) && pass.equals(PASSWORD_FINAL)) {
			System.out.println("Acceso concedido.");
		} else {
			System.out.println("Acceso denegado.");
		}
		
		input.close();
	}
}