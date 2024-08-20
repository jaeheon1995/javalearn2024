package mypractise_Car;

public class Car {

	 int MAX_SPEED = 160;
	int Speed = 0;
	
	public void speedup() {
		
		if(Speed<=MAX_SPEED) {
			Speed += 20;
			System.out.println("20km/h가속");
			System.out.println("현재속도는"+Speed+"입니다");
			
			
		}else {
			Speed=MAX_SPEED;
			System.out.println("더이상 가속할수 없습니다");
		}
		
	
	}
	
	public void speeddown() {
		
		if(Speed>0) {
			
			Speed -= 20;
			
			System.out.println("20km/h 감속됩니다");
			System.out.println("현재속도는"+Speed+"입니다");
		
		}else {
			Speed=0;
			System.out.println("속도가 0입니다");
		}
		
	}
	
}	

	
	

