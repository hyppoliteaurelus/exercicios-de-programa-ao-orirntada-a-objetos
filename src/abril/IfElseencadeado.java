package abril;

import java.util.Scanner;

public class IfElseencadeado {

	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);
		
		System.out.println ("Digite um volor:");
		
		int valor = sc.nextInt();
		
		if (valor<10) {
			System.out.println("valor � menor que 10.\n0 volor � :" + valor);
			
		} else if (valor >=11 && valor < 20) {
			System.out.println("Valor � menor que 20.\nO valor � : " + valor);
		}
		else
		{
			System.out.println("Valor � maior que 20.\nO valor � :" + valor );
		

		}
	  }

}
