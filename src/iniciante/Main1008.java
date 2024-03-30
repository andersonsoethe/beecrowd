package iniciante;

import java.util.Scanner;
import java.io.IOException;

public class Main1008 {
	
	public static void main(String[] args) throws IOException {
	
	int NUMBER;
	double HOURS_PER_MONTH, VALUE_PER_HOUR, SALARY;
	
	Scanner s = new Scanner(System.in);
	
	NUMBER = s.nextInt();
	HOURS_PER_MONTH = s.nextDouble();
	VALUE_PER_HOUR = s.nextDouble();
	
	SALARY = HOURS_PER_MONTH*VALUE_PER_HOUR;
	
	System.out.println("NUMBER = "+NUMBER);
	System.out.printf("SALARY = U$ %.2f%n",SALARY);
	
	
	
	}
}
