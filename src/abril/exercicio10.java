//comentario multilinha

/* O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do 
distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor 
seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, 
calcular e escrever o custo final ao consumidor.*/

package abril;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[]ags) {
		
Scanner sc = new Scanner(System.in);

System.out.println("Digite o valor do custo e fabrica de um carro:");
float custoFabrica = sc.nextFloat();

float custoFinal = custoFabrica + (custoFabrica*28/100)+(custoFabrica*45/100);

System.out.println("o valor final do custo do carro corresponde a :R$"+custoFinal);


	}
}
