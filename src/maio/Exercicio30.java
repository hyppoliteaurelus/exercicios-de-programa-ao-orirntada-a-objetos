/*30) Ler 3 valores (considere que n�o ser�o informados valores iguais) e escrev�-los em ordem 
crescente.*/

package maio;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o 1� valor");
		int valor1 = sc.nextInt();
		
		System.out.println("Digite o  2� valor");
		int valor2 = sc.nextInt();
		
		System.out.println("Digite o  3� valor");
		int valor3 = sc.nextInt();
		
		if((valor1>valor2) && (valor2>valor3)){
			System.out.println("A ordem crescente dos numero � :"+valor3+","+valor2+","+valor1);
		}else if(((valor1<valor2) && (valor2>valor3)) && (valor2<valor3)){
			System.out.println("A ordem crescente dos numero � :"+valor1+","+valor3+","+valor2);	
		}
		else if(((valor1>valor2) && (valor2<valor3))  && (valor1<valor3)) {
			System.out.println("A ordem crescente dos numero � :"+valor2+","+valor1+","+valor3);
		
		}
		else if((valor1<valor2) && (valor2>valor3)){
			System.out.println("A ordem crescente dos numero � :"+valor3+","+valor1+","+valor2);
		}
		else if((valor1>valor2) && (valor2<valor3)){
			System.out.println("A ordem crescente dos numero � :"+valor2+","+valor3+","+valor1);
		}else{
			System.out.println("A ordem crescente dos numero � :"+valor3+","+valor2+","+valor1);	
		}
	
	
	}
}

/*teste de mesa*/
/*123
132
213
231
312
321*/

