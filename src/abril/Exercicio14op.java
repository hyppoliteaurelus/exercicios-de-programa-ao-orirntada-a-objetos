package abril;

import java.util.Scanner;

public class Exercicio14op {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um volor");
		int valor = sc.nextInt();
		
		String saida =(valor<0)?"numero negativo":"Numero positivo";
		
		System.out .println(saida);

	}

}
