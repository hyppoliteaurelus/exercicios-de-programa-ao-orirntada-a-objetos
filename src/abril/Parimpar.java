package abril;

import java.util.Scanner;

public class Parimpar {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int numero =sc.nextInt();
		
		if (numero%2==0) {
			System.out.println("par");
		} else {
			System.out.println("impar");
		}
	}
}
