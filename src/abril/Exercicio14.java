/*14) Ler um valor e escrever a mensagem � MAIOR QUE 10! se o valor lido for maior que 10, caso 
contr�rio escrever N�O � MAIOR QUE 10!*/ 

package abril;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] ags) {
	
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Digite um valor:");
		
		int valor = sc.nextInt();
		
		if(valor<10) {
			System.out.println("� menor que 10!");
		}else {
			System.out.println("� maior que 10!");
		}
		
	}

}
