package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class Main1011 {
 
    public static void main(String[] args) throws IOException {
 
    	Locale.setDefault(Locale.US);
    	Scanner s  = new Scanner(System.in);
    	
    	double pi = 3.14159;
    	
    	double R = s.nextDouble();
    	
    	double volume = (4/3.0)*pi*(R*R*R);
    	
    	System.out.printf("VOLUME = %.3f%n", volume);
    	
    	s.close();
    }
 
}