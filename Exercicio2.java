package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

			
			Scanner sc = new Scanner(System.in);

			int N = sc.nextInt();
		    
			if (N % 2 == 0) {
				System.out.println("PAR");
			}
			else {
				System.out.println("IMPAR");
			}

			sc.close();
	}

}
