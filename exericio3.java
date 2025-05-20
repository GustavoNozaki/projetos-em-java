package Exercicios;

import java.util.Scanner;

public class exericio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int duração;
		if (horaInicial < horaFinal) {
			duração = horaFinal - horaInicial;
		}
		
		else {
			duração = 24 - horaInicial + horaFinal;
		}
		System.out.println ("O JOGO DUROU:" + duração + "Hora(s)");
		
sc.close();
	}

}
