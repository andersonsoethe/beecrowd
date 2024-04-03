package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Main1019 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s  = new Scanner(System.in);
		int segundos = s.nextInt();

		int totalEmhoras = segundos/3600;
		int totalEmMinutos = (segundos % 3600) / 60;
		int totalEmSegundo = segundos % 60;
		System.out.printf("%d:%d:%d%n", totalEmhoras, totalEmMinutos, totalEmSegundo);

		s.close();

	}

 
}