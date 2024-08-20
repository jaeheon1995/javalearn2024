package test2;

import java.util.Scanner;

public class ManualCar extends Car {
//기어 상태라는 속성이 추가
//0-6까지의 정수를 입력 받아 기어 상태를 변경할 수 있는 기능
//기어 변속 기능
	
	
	//가속
		public void accelerate() {
			super.accelerate();
			System.out.println("수동 변속기 차량이 가속합니다");}
		//정차
		public void stop(){
			super.stop();
			System.out.println("수동 변속기 차량이 정차합니다");
		}
		//시동
		public void setStart() {
			super.setStart();
			
		}
		//기어
		public void gear() {
			Scanner scan = new Scanner(System.in);
			int gear = scan.nextInt()	;
			
			if(gear == 6) {
				System.out.println("기어 상태 = 6");
				return;
			}if(gear == 5) {
				System.out.println("기어 상태 = 5");
				return;
			}if(gear == 4) {
				System.out.println("기어 상태 = 4");
				return;
			}if(gear ==3) {
				System.out.println("기어 상태 = 3");
				return;
			}if(gear == 2) {
				System.out.println("기어 상태 = 2");
				return;
				
			}if(gear == 1) {
				System.out.println("기어 상태 = 1");
				return;
			}if(gear ==0) {
				System.out.println("기어 상태 = 0");
				return;
			}else {System.out.println("잘못된 입력입니다");}
			scan.close();
		}
}
