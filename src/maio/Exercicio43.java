package maio;

import java.util.Scanner;

public class Exercicio43 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o valor do lado A:");

		float ladoa = sc.nextFloat();

		System.out.println("Digite o valor do lado B:");

		float ladob = sc.nextFloat();

		System.out.println("Digite o valor do lado C:");

		float ladoc = sc.nextFloat();



		if ((ladoa<ladob+ladoc) && (ladob<ladoa+ladoc) && (ladoc<ladoa+ladob)) {

		if ((ladoa==ladob) && (ladob==ladoc)) {

		System.out.println("Tri�ngulo Equil�tero");

		} else

		if ((ladoa==ladob) || (ladob==ladoc) || (ladoa==ladoc)) {

		System.out.println("Tri�ngulo Is�sceles");

		}

		else {

		System.out.println("Tri�ngulo Escaleno");

		}

		} else {

		System.out.println("N�o e poss�vel formar um tri�ngulo");

		}

		}

		

	}


