package esplicaçao;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de maças que deseja comprar");
		
		int numeroMaças = sc.nextInt();
		
		if (numeroMaças<12) {
		
			double valorTotal = numeroMaças*1.3;
			
			System.out.println("O valor a ser pago é :"+valorTotal);
		}else{
			
			double valorTotal = numeroMaças*1;
			
			System.out.println("O valor a ser pago é :"+valorTotal);
			
		}

	}

}
