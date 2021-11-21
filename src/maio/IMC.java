package maio;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o seu peso em KG:");

		float peso = sc.nextFloat();

		System.out.println("Digite a sua altura em MT:");

		float altura = sc.nextFloat();

		float imc = peso / (altura * altura);

		if (imc < 18.5) {
			System.out.println("Abaixo do Peso.\nSeu IMC é:" + imc);
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println(" Peso normal.\nSeu IMC é:" + imc);
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println(" SobrePeso .\nSeu IMC é:" + imc);
		} else if (imc >= 30 && imc <= 34.9) {
			System.out.println(" Obesidade Grau 1.\nSeu IMC é:" + imc);
		} else if (imc >= 35 && imc <= 39.9) {
			System.out.println(" Obesidade Grau 2.\nSeu IMC é:" + imc);
		} else {
			System.out.println(" Obesidade Grau 3 Morbida.\nSeu IMC é:" + imc);

		}
		sc.close();

	}

}
