package watermelone;

import java.util.Scanner;

public class If_Elsepractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int watermelone = scan.nextInt()	;
		
		if(watermelone >= 10) {
			System.out.println("1등급");
			return;
		}if(watermelone >= 7) {
			System.out.println("2등급");
			return;
		}if(watermelone >= 4) {
			System.out.println("3등급");
			return;
		}else {
			System.out.println("4등급");
		}
		
		scan.close();
		
	}

}
