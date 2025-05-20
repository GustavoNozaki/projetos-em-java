package primeiro_projeto;

import java.util.Scanner;

public class aula7 { 

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int hora;
		
		System.out.println ("Que horas são?");
		hora = sc.nextInt();
		if (hora < 12 ) {
			System.out.println("Bom dia");
			
		}
			else {
				if (hora < 18) {
					System.out.println ("boa tarde");
				}
				else {
					System.out.println ("boa noite");
					
				}
				
			}
			
			sc.close ();

	}
						
}
