package primeiro_projeto;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner (System.in);
		double Numero = sc.nextDouble();
		double Numero_1 = sc.nextDouble();
		
		
		
		double area = Numero + Numero_1;
		
		
		System.out.printf("SOMA = %.2f%n", area);
		
		
		sc.close();



	}

}
