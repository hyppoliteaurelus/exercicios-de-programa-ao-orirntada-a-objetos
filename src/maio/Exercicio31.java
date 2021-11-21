package maio;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do 1° lado do triangulo");
		int ladoA = sc.nextInt();
		
		System.out.println("Digite o valor do 2° lado do triangulo");
		int ladoB = sc.nextInt();
		
		System.out.println("Digite o valor do 3° lado do triangulo");
		int ladoC = sc.nextInt();
		
      if((ladoA < ladoB + ladoC) &&  (ladoB<ladoA+ladoC)&& (ladoC<ladoA+ladoB))  {
			 System.out.println("Forma um triangulo");
		}else  {
		
			 System.out.println("nessas condiçoes não forma-se um triangulo");
				}
				
			}

		}
		
