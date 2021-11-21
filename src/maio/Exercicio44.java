/*44) Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido 
um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero e imprimir o resultado 
da divisão do primeiro valor lido pelo segundo valor lido. (utilizar a estrutura REPITA)*/

package maio;

import java.util.Scanner;

public class Exercicio44 {

	public static void main(String[] args) {
		int valor2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o 1° valor :");
		int valor1= sc.nextInt();
		
		do {
			System.out.println("Digite o 2° valor :");
			valor2 = sc.nextInt();
			
		} while(valor2 == 0);
		
		float resultado= valor1/valor2;
		System.out.println("o valor da divisão é corresponde a :" + resultado);
		
	}

	}


