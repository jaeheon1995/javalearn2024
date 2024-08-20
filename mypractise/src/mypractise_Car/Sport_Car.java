package mypractise_Car;

public class Sport_Car extends Car {

	int MAX_SPEED = 200;
	int Speed = 0;
	
	public void speedup() { 
		
	
		if(Speed<=MAX_SPEED) {
			Speed += 45;
			System.out.println("45km/h가속");
			System.out.println("현재속도는"+Speed+"입니다");
			
			
		}else {
			Speed=MAX_SPEED;
			System.out.println("더이상 가속할수 없습니다");
		}
		
	
	}
	
	public void speeddown() {
		
		if(Speed>0) {
			
			Speed -= 45;
			
			System.out.println("45km/h 감속됩니다");
			System.out.println("현재속도는"+Speed+"입니다");
		
		}else {
			Speed=0;
			System.out.println("속도가 0입니다");
		}
		
	}
	
}	
	
	
	

