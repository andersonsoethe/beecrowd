package iniciante;

import java.io.IOException;
import java.util.Scanner;


public class Main1002 {
 
    public static void main(String[] args) throws IOException {
 
    	double A, R, n;
    	
    	
    	Scanner s = new Scanner(System.in);
    	R = s.nextDouble();
    	

    	n = 3.14159;
    	
    	A = n * (R*R);
    	
    	System.out.printf("A=%.4f%n",A);
 
    }
 
}