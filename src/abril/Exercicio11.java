/*11) Uma revendedora de carros usados paga a seus funcion�rios vendedores um sal�rio fixo por m�s, 
mais uma comiss�o tamb�m fixa para cada carro vendido e mais 5% do valor das vendas por ele 
efetuadas. Escrever um algoritmo que leia o n�mero de carros por ele vendidos, o valor total de suas 
vendas, o sal�rio fixo e o valor que ele recebe por carro vendido. Calcule e escreva o sal�rio final do 
vendedor. */

package abril;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero de carro vendidos :");
		
		int numeroCarroVendido = sc.nextInt();
		
		System.out.println("Digite o valor total de suas vendas :");
		
       float valorTotalVendas = sc.nextFloat();
       
       System.out.println("Digite o valor recebido por carro vendido :");
       
       float valorCarroVendido = sc.nextFloat();
       
       System.out.println("Digite o valor recebido no salario fixo:");
       
       float valorSalarioFixo = sc.nextFloat();
       
       float salarioFinal = valorSalarioFixo +(numeroCarroVendido*valorCarroVendido)+(valorTotalVendas*5/100);
       
       System.out.println("o valor final do vendedor corresponde a: R$"+salarioFinal);
       
    		   
	}

}
