/*45) Reescreva o exercício anterior utilizando a estrutura ENQUANTO. */

package maio;

import java.util.Scanner;

public class Exercicio45 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1° valor :");
		int valor1= sc.nextInt();
		
		System.out.println("Digite o 2° valor :");
		int valor2 = sc.nextInt();
		
		while(valor2==0) {
			System.out.println("Digite o 2° valor :");
			valor2 = sc.nextInt();
		}
		
		float resultado= valor1/valor2;
		System.out.println("o valor da divisão é corresponde a :" + resultado);
		
		}
	}


