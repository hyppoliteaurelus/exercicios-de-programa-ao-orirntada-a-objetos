package abril;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a primeira nata:");
		
		float nota1 = sc.nextFloat();
		
		System.out.println("Digite a segunda nata:");
		
		float nota2 = sc.nextFloat();
		
		float média =(nota1+nota2)/2;
		
		if (média>=6) {
			
			System.out.println("Aluno Aprovado"+média);
		}else{
			System.out.println("Aluno Reprovado"+média);
		}
    sc.close();
    
	}

}
