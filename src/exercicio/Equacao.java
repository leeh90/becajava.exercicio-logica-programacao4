package exercicio;

public class Equacao {

	int valorA;
	int valorB;
	int valorC;

	double delta = Math.pow(valorB, 2) - (4 * valorA * valorC);
	// Chamando o metodo Math.pow para elevar o 2 ao quadrado (Potenciacao)

	public double CalcularBhaskara(double delta) {
		// Condicoes do delta
		if (delta < 0) {
			System.out.println("Não existe um resultado real para está equação \n");
		} else if (delta == 0) {
			double x;
			x = -valorB / (2 * valorA);
			System.out.println("O valor real de x1 e x2 é = " + x);
		} else if (delta > 0) {
			double x1, x2;
			x1 = (-valorB + Math.sqrt(delta)) / (2 * valorA);
			x2 = (-valorB - Math.sqrt(delta)) / (2 * valorA);
			// Metodo Math.sqrt calcula a raiz quadrada de delta

			System.out.printf("x1 igual a =" + x1 + "\n");
			System.out.printf("x2 igual a =" + x2);
		}
		return delta;

	}
}
