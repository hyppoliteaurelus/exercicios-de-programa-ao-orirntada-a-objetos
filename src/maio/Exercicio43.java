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

		System.out.println("Triângulo Equilátero");

		} else

		if ((ladoa==ladob) || (ladob==ladoc) || (ladoa==ladoc)) {

		System.out.println("Triângulo Isósceles");

		}

		else {

		System.out.println("Triângulo Escaleno");

		}

		} else {

		System.out.println("Não e possível formar um triângulo");

		}

		}

		

	}


