//Exercicio6

/*6) Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura), calcular e escrever a 
�rea do ret�ngulo. */

/**javadoc 
 * Esse exercicio trata se do calculo de uma area de um triangulo
 * Autor JAILSON
 * 14/04/2021
 */

package abril;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[]ags) {
		
		Scanner scanner = new Scanner(System.in);
	
		//Entrada de Dados
		
		
		
		System.out.print("Digite a base de retangulo");
		float base = scanner.nextFloat();
		System.out.print("Digite a base de retangulo");
		float altura = scanner.nextFloat();
	
		//Processamento
		float area = base * altura;
		//Saida de Dados
		System.out.println("A area do retangulo �:"+ area +"cm�");
	}
}
