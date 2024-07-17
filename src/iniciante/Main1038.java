package iniciante;

import java.util.Locale;
import java.util.Scanner;

/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

1 Cachorro Quente R$ 4.00
2 X - Salada	  R$ 4.50
3 X - Bacon		  R$ 5.00
4 Torrada Simples R$ 2.00
5 Refrigerante	  R$ 1.50

Entrada:
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.

Saída:
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.


 */

public class Main1038 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s  = new Scanner(System.in);
		int codigo = s.nextInt();
		int quantidade = s.nextInt();
		double preco = 0.0;

		if (codigo == 1)
			preco = 4.00;
		if (codigo == 2)
			preco = 4.50;
		if (codigo == 3)
			preco = 5.00;
		if (codigo == 4)
			preco = 2.00;
		if (codigo == 5)
			preco = 1.50;

		System.out.printf("Total: R$ %.2f%n", (preco*quantidade));
		s.close();
	}
}