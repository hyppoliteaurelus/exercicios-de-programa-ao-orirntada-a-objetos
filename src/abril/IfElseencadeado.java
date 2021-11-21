package abril;

import java.util.Scanner;

public class IfElseencadeado {

	public static void main(String[] args) {
		
     Scanner sc = new Scanner(System.in);
		
		System.out.println ("Digite um volor:");
		
		int valor = sc.nextInt();
		
		if (valor<10) {
			System.out.println("valor é menor que 10.\n0 volor é :" + valor);
			
		} else if (valor >=11 && valor < 20) {
			System.out.println("Valor é menor que 20.\nO valor é : " + valor);
		}
		else
		{
			System.out.println("Valor é maior que 20.\nO valor é :" + valor );
		

		}
	  }

}
