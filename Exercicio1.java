package Exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int numero;
		
		System.out.println("digite um numero");
		numero = sc.nextInt();
		if (numero > -1) {
			System.out.println("numero não e negativo");
		}
		else {
			System.out.println ("numero e negativo");
		}
		
		sc.close ();

	}
         
}
