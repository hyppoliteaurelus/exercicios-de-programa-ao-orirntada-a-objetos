package abril;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[]ags) {
	
		
		Scanner sc = new Scanner(System.in); 
				
		System.out.print("Digite um numero:");
		
		int numero = sc.nextInt();
		
		int antecessor=numero-1;
		
		System.out.println("o numero antecessor do digitedo é:" + antecessor);
	}
}
