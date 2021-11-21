package abril;

import java.util.Scanner;

public class Exercicio09 {

	
	
	public static void main(String[]ags) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu salario mensal:");
		float salarioMensal = sc.nextFloat();
		System.out.println("Digite o seu percentual reajuste:");
		float percentualReajuste = sc.nextFloat();
		
		//Processamento
		
		float reajuste = salarioMensal*percentualReajuste/100;
		float salarioFinal = salarioMensal + reajuste;
		//Saida
		
		System.out.println("O novo salario reajuste corresponde á :R$"+salarioFinal);
		
		
	}
	
	
}
