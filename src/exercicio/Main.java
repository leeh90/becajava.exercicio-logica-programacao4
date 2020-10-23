package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		// Instanciando o Objeto da Classe Equacao;

		Equacao equacao1 = new Equacao();

		// Lendo as entradas do usuário e atribuindo ao atributo da Classe >>
		// equacao1.valorA,valorB,valorC

		System.out.println("Digite o valor de a: ");
		equacao1.valorA = ler.nextInt();
		System.out.println("Digite o valor de b: ");
		equacao1.valorB = ler.nextInt();
		System.out.println("Digite o valor de c: ");
		equacao1.valorC = ler.nextInt();

		equacao1.CalcularBhaskara(equacao1.delta);
		
		ler.close();
	}
}