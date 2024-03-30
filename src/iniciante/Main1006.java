package iniciante;


import java.io.IOException;
import java.util.Scanner;

public class Main1006 {
 
    public static void main(String[] args) throws IOException {
 
    	double A, B, C, X, APESO, BPESO, CPESO;
    	
    	Scanner s = new Scanner(System.in);
    	A = s.nextDouble();
    	B = s.nextDouble();
    	C = s.nextDouble();
    	
    	APESO = A*2;
    	BPESO = B*3;
    	CPESO = C*5;
    	
    	
    	X = (APESO+BPESO+CPESO)/10.0;
    	
    	System.out.printf("MEDIA = %.1f%n",X);
    	
    	}

    }
