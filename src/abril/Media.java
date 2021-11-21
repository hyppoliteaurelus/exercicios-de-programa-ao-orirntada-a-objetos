//calculo da média de 4 notas
package abril;

import java.util.Scanner;

public class Media {
	
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a 1° nota:");
		float nota1 = sc.nextFloat();
		System.out.println("Digite a 2° nota:");
		float nota2 = sc.nextFloat();
		System.out.println("Digite a 3° nota:");
		float nota3 = sc.nextFloat();
		System.out.println("Digite a 4° nota:");
		float nota4 = sc.nextFloat();
		
		//Processamento
		
		float média = (nota1+nota2+nota3+nota4)/4;
		
		//Saida
		
		System.out.println("A média do aluno corresponde á: "+média);
		
	}

}
