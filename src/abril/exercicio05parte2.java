package abril;

import java.util.Scanner;

public class exercicio05parte2 {

	public static void main(String[]ags) {
	
		Scanner sc =new Scanner(System.in);
		
		System.out.print("digite um numero:");
		int numero = sc.nextInt();
		
		int sucessor = numero + 1;
		
		System.out.print("o numero sucessor é :" + sucessor);
	}
}
