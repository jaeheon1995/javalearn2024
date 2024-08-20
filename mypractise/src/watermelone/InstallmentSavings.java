package watermelone;

import java.util.Scanner;

public class InstallmentSavings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Scanner sc = new Scanner(System.in);
		
		int start = sc.nextInt()	;
		int before = sc.nextInt();
		int after = sc.nextInt();
		
		int money = start ;
		int month = 1;
		
		while(money < 70) {
			money += start;
			month ++;
		}while(money<100) {
			
			
		}
	}

}
