package iniciante;

import java.io.IOException;
import java.util.Scanner;
 

public class Main1007 {
 
    public static void main(String[] args) throws IOException {
 
    	int A, B, C, D, X;
    	
    	Scanner s = new Scanner(System.in);
    	A = s.nextInt();
    	B = s.nextInt();
    	C = s.nextInt();
    	D = s.nextInt();
    	
 
    	X = A*B-C*D;
    	
    	System.out.println("DIFERENCA = "+X);
 
    }
 
}