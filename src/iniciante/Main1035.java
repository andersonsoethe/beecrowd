package iniciante;

import java.util.Locale;
import java.util.Scanner;


public class Main1035 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s  = new Scanner(System.in);

		String valor = s.nextLine();
		String[] array = valor.split(" ");
		int A = Integer.parseInt(array[0]);
		int B = Integer.parseInt(array[1]);
		int C = Integer.parseInt(array[2]);
		int D = Integer.parseInt(array[3]);

		if (B > C && D > A && (C+D) > (A+B) && C >= 0 && D >= 0 && A%2 == 0){
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}
		s.close();
	}
}