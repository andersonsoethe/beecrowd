package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

// não compilou no eclipse, mas no site rodou, só deus sabe o porque
public class Main1010 {
 
    public static void main(String[] args) throws IOException {
    	
    	Scanner s = new Scanner(System.in);
    	
    	Locale.setDefault(Locale.US);
    	int codprod1 = s.nextInt();
    	int uniprod1 = s.nextInt();
    	double priceprod1 = s.nextDouble();
    	int codprod2 = s.nextInt();
    	int uniprod2 = s.nextInt();
    	double priceprod2 = s.nextDouble();
    	
    	double totalprice = uniprod1 * priceprod1 + uniprod2 * priceprod2;
    	
    	System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalprice);
    	
    	s.close();
    	
    	
    	
    	
    }
 
}