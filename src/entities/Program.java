package entities;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/*
Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor
da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos.
Exemplo 1:
Base do retangulo: 4.0
Altura do retangulo: 5.0
AREA = 20.0000
PERIMETRO = 18.0000
DIAGONAL = 6.4031
Exemplo 2:
Base do retangulo: 10.3
Altura do retangulo: 13.1
AREA = 134.9300
PERIMETRO = 46.8000
DIAGONAL = 16.6643
		 */
		// Variáveis 
		Double base;
		Double altura;
		Double area;
		Double perimetro;
		Double diagonal;
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);		
		
		System.out.print("Base do retangulo: ");
		base = leia.nextDouble();
		System.out.print("Altura do retangulo: ");
		altura = leia.nextDouble();
		area = base * altura;
		System.out.printf("Area = %.4f\n", area);
		perimetro = base + base + altura + altura;
		System.out.printf("PERIMETRO = %.4f\n", perimetro);
		diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		System.out.printf("DIAGONAL = %.4f\n", diagonal);
		
		leia.close();
		// Fim <-> Agoritmo para calcular os valores de um retangulo
	}

}
