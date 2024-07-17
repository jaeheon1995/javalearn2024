package exam09;

import java.util.Scanner;

public class UpDownGame02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = (int)(Math.random() * 50 + 1);
		Scanner scan = new Scanner (System.in);
		
		int count = 0;
		int user = 0;
		for(;;) {
			System.out.println("숫자를 입력! : ");
			user = scan.nextInt();
			
			if(target==user) {
				System.out.println("정답! 숫자는 "+ user + "입니다" + count + "만에 맞췄네요");
				break;
				
			}else if(target > user) {
				System.out.println("Up");
			}else if(target < user) {
				System.out.println("Down");
			}count++;
			
			
				
			
		
			
		}
		scan.close();
		

	}

}
