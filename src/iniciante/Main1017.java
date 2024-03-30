package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Main1017 {
    public static void main(String[] args) throws IOException {
    	Locale.setDefault(Locale.US);
    	Scanner s  = new Scanner(System.in);
		int tempo = s.nextInt();
		int velocidade = s.nextInt();

		double litros = (double) (tempo * velocidade) /12;

    	System.out.printf("%.3f%n", litros);
    	s.close();
    }
 
}