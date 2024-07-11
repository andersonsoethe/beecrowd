package iniciante;

import java.util.Locale;
import java.util.Scanner;


public class Main1021 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s  = new Scanner(System.in);
		double valor = s.nextDouble();

		System.out.printf("NOTAS:%n");
		System.out.printf("%.0f nota(s) de R$ 100.00%n", Math.floor(valor/100));
		valor = valor % 100;
		System.out.printf("%.0f nota(s) de R$ 50.00%n", Math.floor(valor/50));
		valor = valor % 50;
		System.out.printf("%.0f nota(s) de R$ 20.00%n", Math.floor(valor/20));
		valor = valor % 20;
		System.out.printf("%.0f nota(s) de R$ 10.00%n", Math.floor(valor/10));
		valor = valor % 10;
		System.out.printf("%.0f nota(s) de R$ 5.00%n", Math.floor(valor/5));
		valor = valor % 5;
		System.out.printf("%.0f nota(s) de R$ 2.00%n", Math.floor(valor/2));
		valor = valor % 2;
		System.out.printf("MOEDAS:%n");
		System.out.printf("%.0f moeda(s) de R$ 1.00%n", Math.floor(valor/1));
		valor = valor % 1;
		System.out.printf("%.0f moeda(s) de R$ 0.50%n", Math.floor(valor/0.50));
		valor = valor % 0.50;
		System.out.printf("%.0f moeda(s) de R$ 0.25%n", Math.floor(valor/0.25));
		valor = valor % 0.25;
		System.out.printf("%.0f moeda(s) de R$ 0.10%n", Math.floor(valor/0.10));
		valor = valor % 0.10;
		System.out.printf("%.0f moeda(s) de R$ 0.05%n", Math.floor(valor/0.05));
		valor = valor % 0.05;
		System.out.printf("%.0f moeda(s) de R$ 0.01%n", valor/0.01);
		s.close();
	}
}