package esplica�ao;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de ma�as que deseja comprar");
		
		int numeroMa�as = sc.nextInt();
		
		if (numeroMa�as<12) {
		
			double valorTotal = numeroMa�as*1.3;
			
			System.out.println("O valor a ser pago � :"+valorTotal);
		}else{
			
			double valorTotal = numeroMa�as*1;
			
			System.out.println("O valor a ser pago � :"+valorTotal);
			
		}

	}

}
