/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package twoexe;

import java.util.Scanner;

/**
 *
 * @author fundacion
 */
public class Twoexe {


    public static void main(String[] args) { 
	
	    Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scan.nextInt();
        if ((number % 2 == 0) || (number <=0 ))
        {
            System.out.print("Set number that must be odd and >0"); 			
			System.exit(0); 
		}

        int[][] magic_square = new int[number][number];

        int row_num = number-1;
        int col_num = number/2;
        magic_square[row_num][col_num] = 1;

        for (int i = 2; i <= number*number; i++) {
            if (magic_square[(row_num + 1) % number][(col_num + 1) % number] == 0) {
                row_num = (row_num + 1) % number;
                col_num = (col_num + 1) % number;
            }
            else {
                row_num = (row_num - 1 + number) % number;                
            }
            magic_square[row_num][col_num] = i;
        }

    
        for (int r= 0; r < number; r++) {
            for (int c = 0; c < number; c++) {
                if (magic_square[r][c] < 10)  System.out.print(" ");   
                if (magic_square[r][c] < 100) System.out.print(" ");  
                // we can add espace to have a better view of the matrix
                System.out.print(magic_square[r][c] + " ");
            }
            System.out.println();
        }

    }
}