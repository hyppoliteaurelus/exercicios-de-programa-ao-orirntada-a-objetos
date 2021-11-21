//27) Ler um valor e escrever se é positivo, negativo ou zero.


package abril;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Digite um valor:");
	 int numero = sc.nextInt();
	 
	 if (numero < 0) {
		 System.out.println("Numero Negative");
	 } else if (numero==0){
		 System.out.println("Numero Neutro");
	 } 
	 else {
		 System.out.println("Numero positivo");
		 {
			 
		 }
	
	}
	

	}

}
