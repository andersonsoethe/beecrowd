package iniciante;

import java.util.Locale;
import java.util.Scanner;


public class Main1020 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s  = new Scanner(System.in);
		int idadeDiasTotal = s.nextInt();
		int idadeAno = idadeDiasTotal / 365;
		int idadeMeses = (idadeDiasTotal % 365) / 30;
		int idadeDias = (idadeDiasTotal % 365) % 30;

		System.out.printf("%d ano(s)%n", idadeAno);
		System.out.printf("%d mes(es)%n", idadeMeses);
		System.out.printf("%d dia(s)%n", idadeDias);

		s.close();

	}

 
}