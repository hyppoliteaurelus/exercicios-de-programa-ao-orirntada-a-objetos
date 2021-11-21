package maio;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);	
	
	System.out.println("Digite o seu nome:");
	String nome =sc.nextLine();
	
	System.out.println("Digite o seu sexo:");
    char sexo = sc.next().charAt(0);
    
    System.out.println("Digite o seu altura:");
    float altura = sc.nextFloat();
	
    if (sexo=='M') {
    	double pesoIdeal = (72.7*altura)-58;
    System.out.println("Nome:"+nome+"com altura:"+altura+",possui o peso ideal de :"+pesoIdeal);
    
    }else{
    	double pesoIdeal = (62.1*altura)-44.7;
    	 System.out.println("Nome:"+nome+"com altura:"+altura+",possui o peso ideal de :"+pesoIdeal);
    	    
    }
	}

}
