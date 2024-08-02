package ACTIVIDAD3;

import java.util.Scanner;

/*
 * 39.Nos proponemos desarrollar un “Tiro al blanco” en el cual 2 o más participantes realizan 3
disparos consecutivos cada uno. Cada tiro, dependiendo de la distancia al centro da un
puntaje que se acumula (se suman los tres disparos). Gana el jugador con mayor puntaje (se
supone único).

La puntuación para cada tiro es la siguiente:
-Si la distancia respecto al centro es O se ganan 500 puntos;
-Si la distancia es <= a 10, se ganan 250;
-Si la distancia está entre 11 y 50 ganará 100 puntos;
-Si es mayor no ganará nada (cayó fuera del tablero).

La mecánica del juego es la siguiente:
Se pide la cantidad de jugadores (mayor o igual a 2).
Por cada jugador:
- Ingresar el nombre
- Ingresar la distancia de cada uno de sus tres tiros consecutivos (número mayor o igual
a cero), calculando para cada uno de estos el puntaje obtenido.

Se pide:
- Informar el nombre del participante ganador del torneo y su puntaje (suponer único máximo)
- Informar la cantidad total de tiros al centro.
 */
public class Ej39 {
	final static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		final int TIROS_TOTAL = 3;
		final int PUNTAJE_TIRO_CENTRO = 500;
		final int PUNTAJE_TIRO_CERCA = 250;
		final int PUNTAJE_TIRO_MEDIO = 100;
		
		int cantParticipantes;
		int distancia;
		int tiroAlCentro = 0;
		int puntosObtenidos = 0;
		int puntajeMaximo = 0;
		String nombreParticipante;
		String jugadorGanador = "";

		do {
			System.out.println("Ingrese la cantidad de participantes.");
			cantParticipantes = Integer.parseInt(input.nextLine());
		} while (cantParticipantes < 2);

		for (int i = 1; i <= cantParticipantes; i++) {
			System.out.println("Ingrese el nombre del participante numero: " + i);
			nombreParticipante = input.nextLine();
			puntosObtenidos = 0;
			
			for (int j = 1; j <= TIROS_TOTAL; j++) {
				System.out.println("Ingrsee la distancia del tiro numero: " + j + ". Numero mayor o igual a cero.");
				do {
					distancia = Integer.parseInt(input.nextLine());
					if (distancia < 0) {
						System.out.println("Error. Ingrese nuevamente la distancia tiro numero: " + j + ". Numero mayor o igual a cero.");
					}

					if (distancia == 0) {
						puntosObtenidos += PUNTAJE_TIRO_CENTRO;
						tiroAlCentro++;
					} else if (distancia <= 10) {
						puntosObtenidos += PUNTAJE_TIRO_CERCA;
					} else if (distancia > 10 && distancia <= 50) {
						puntosObtenidos += PUNTAJE_TIRO_MEDIO;
					} 

				} while (distancia < 0);

				if (puntosObtenidos > puntajeMaximo) {
					puntajeMaximo = puntosObtenidos;
					jugadorGanador = nombreParticipante;
				}
			}

		}
		System.out.println("La cantidd de tiros al centro fueron: " + tiroAlCentro);
		System.out.println("El jugador ganador fue: " + jugadorGanador + ". Con un puntaje de " + puntajeMaximo + " puntos.");
	}
}