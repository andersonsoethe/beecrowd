package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
public class Main1016 {
 
    public static void main(String[] args) throws IOException {
    	Locale.setDefault(Locale.US);
    	Scanner s  = new Scanner(System.in);
		int km = s.nextInt();
		int minutos = (60*km)/30;

    	System.out.printf("%d minutos%n", (minutos));
    	s.close();
    }
 
}