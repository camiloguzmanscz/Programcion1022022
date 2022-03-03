/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package one;

import java.util.Scanner;

/**
 *
 * @author fundacion
 */
public class One {


 



 

	

	static int[][] matriz = new int[4][4];

 


	static void showmenu() {

		System.out.println("\nMatriz creada");

		System.out.println("------ ------");

		for (int fila = 0; fila < matriz.length; fila++) {

			for (int col = 0; col < matriz[0].length; col++)

				System.out.print(matriz[fila][col] + " ");

			System.out.println();

		}

		System.out.println("\nOPERACIONES:");

		

		System.out.println("(1) Sumar  la FILA.");

		System.out.println("(2) Sumar la COLUMNA.");

		System.out.println("(3) Sumar la diagonal PRINCIPAL.");

		System.out.println("(4) Sumar diagonal INVERSA.");

		System.out.println("(5) Obtener media MATRIZ.");

		System.out.println("(6) FIN.");

 

	}


 

	static int colsum(int col) {

		int suma = 0;

		for (int fila = 0; fila < matriz.length; fila++)

			suma += matriz[fila][col];

 

		return suma;

	}

 

	static int sumdiago() {

		int suma = 0;

 

		for (int i = 0; i < matriz.length; i++)

			suma += matriz[i][i];

 

		return suma;

	}
        static int rowsum(int fila) {

		int suma = 0;

		for (int col = 0; col < matriz[fila].length; col++)

			suma += matriz[fila][col];

 

		return suma;

	}
 

	static int inversediago() {

		int suma = 0;

 

		int fila = matriz.length-1;

		int col = 0;

		while (fila >= 0 && col < matriz[0].length) {

			suma += matriz[fila][col];

			fila--;

			col++;

		}

 

		return suma;

	}

 

	static int mediaMatriz() {

		int sum= 0;

		for (int fila = 0; fila < matriz.length; fila++)

			for (int col = 0; col < matriz[0].length; col++)

				sum += matriz[fila][col];

 

		return sum/ (matriz.length * matriz[0].length);

	}

 

	
 

	public static void main(String[] args) {

 

		Scanner teclado = new Scanner(System.in);



		System.out.println("Introduce valores para la MATRIZ:");

		for (int fila = 0; fila < matriz.length; fila++) {

			for (int col = 0; col < matriz[0].length; col++) {

				System.out.print("\nPosición " + fila + "," + col + ": ");

				matriz[fila][col] = teclado.nextInt();

			}

		}

		
		int opcion = 0;

		while (opcion != 6) {

			showmenu();

			System.out.print("Elije una operación: ");

			opcion = teclado.nextInt();

			switch (opcion) {

			case 1:

				System.out.print("\nIndica que FILA quieres sumar: ");

				int row = teclado.nextInt();

				System.out.println("La suma es: " + rowsum(row));

				break;

			case 2:

				System.out.print("\nIndica que COLUMNA quieres sumar: ");

				int col = teclado.nextInt();

				System.out.println("La suma es: " + colsum(col));

				break;

			case 3:

				System.out.println("\nSuma de diagonal PRINCIPAL es: " + sumdiago());

				break;

			case 4:

				System.out.println("\nSuma de diagonal INVERSA es: " + inversediago());

				break;

			case 5:

				System.out.println("\nLa media es: " + mediaMatriz());

				break;

			case 6:

				System.out.println("\nFIN DE PROGRAMA");

				break;

			default:

				System.out.println("Opción incorrecta");

			}

		}

		teclado.close();

	}

 

}
   
