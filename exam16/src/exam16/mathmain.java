package exam16;

import java.util.Scanner;

public class mathmain {
 public static void main(String[] args) {
	
	 Scanner scan = new Scanner(System.in);
	 System.out.println("넓이를 구할 원의 반지름 : ");
	 
	 int ban = scan.nextInt();
	 
	 double result = (ban*ban)*MathCalc.pi;
	 MathCalc.print(result);
	 
	 scan.close();
}
}
