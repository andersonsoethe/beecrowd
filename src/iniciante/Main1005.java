package iniciante;


import java.io.IOException;
import java.util.Scanner;

public class Main1005 {
 
    public static void main(String[] args) throws IOException {
 
    	double A, B, X;
    	
    	Scanner s = new Scanner(System.in);
    	A = s.nextDouble();
    	B = s.nextDouble();
    	
    	X = ((A*3.5)+(B*7.5))/11;
    	
    	System.out.printf("MEDIA = %.5f%n",X);
    	
    	}

    }
