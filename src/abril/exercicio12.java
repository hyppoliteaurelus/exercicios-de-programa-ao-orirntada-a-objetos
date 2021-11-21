
/* Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor 
correspondente em graus Celsius (baseado na fórmula abaixo):/* 
c/5=f-32/9

Observação: Para testar se a sua resposta está correta saiba que 100oC = 212F
*/


package abril;

import java.util.Scanner;

public class exercicio12 {

public static void main(String[]ags) {
	
Scanner sc = new Scanner(System.in);

System.out.println("D|igite a temperatura em graus Fahrenheit");

float temperaturaFahrenheit = sc.nextFloat();

 float temperaturaCelsius = (temperaturaFahrenheit-32)*5/9;
 
 System.out.println("A temperatura em graus Celsius orresponde a :"+ temperaturaCelsius + "°C");
	
}


}
