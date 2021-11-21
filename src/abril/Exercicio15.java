package abril;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
System.out.println("Digite um numero");
 int numero = sc.nextInt(); 
 
 if (numero<0) {
	 System.out.println("numero negativo");
 } else {
	 System.out.println("numero positivo");
 }
	}

}
