package maio;

import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("digite o valor do raio:");
		
		float raio = sc.nextFloat();
		
		double area = 3.14*raio*raio;
		
      System.out.println("A area do circulo corresponde a :"+area);
      
	}

}
